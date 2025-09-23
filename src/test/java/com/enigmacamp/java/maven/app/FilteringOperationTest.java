package com.enigmacamp.java.maven.app;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

    @Test
    void testFilter() {
        List.of("Rizqi", "Reza", "Ardiansyah", "Ummu", "Sa'adah").stream()
        .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8,9,10).stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Rizqi", "Reza", "Ardiansyah", "Ummu", "Sa'adah", "Rizqi", "Reza").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
