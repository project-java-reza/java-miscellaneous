package com.enigmacamp.java.maven.app;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        List.of("Rizqi", "Reza", "Ardiansyah", "Ummu", "Sa'adah").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Rizqi", "Reza", "Ardiansyah", "Ummu", "Sa'adah").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Rizqi", "Reza", "Ardiansyah", "Ummu", "Sa'adah").stream()
                .takeWhile(name -> name.length() <= 5)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Rizqi", "Reza", "Ardiansyah", "Ummu", "Sa'adah").stream()
                .dropWhile(name -> name.length() <= 5)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Rizqi", "Reza", "Ardiansyah", "Ummu", "Sa'adah").stream()
                .findAny();

        optional.ifPresent(name -> System.out.println(name));
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Jamal", "Reza", "Ardiansyah", "Ummu", "Sa'adah").stream()
                .findFirst();

        optional.ifPresent(name -> System.out.println(name));
    }

}
