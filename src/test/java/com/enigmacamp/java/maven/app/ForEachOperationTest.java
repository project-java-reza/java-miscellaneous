package com.enigmacamp.java.maven.app;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testPeekManual() {
        List.of("Rizqi", "Reza", "Ardiansyah", "Ummu", "Sa'adah").stream()
                .map(name ->{
                    System.out.println("Before change name to upper: " + name);
                    String upper =  name.toUpperCase();
                    System.out.println("Change name to upper: " + upper);
                    return upper;
                })
                .forEach(System.out::println);
    }

    @Test
    void testPeek() {
        List.of("Rizqi", "Reza", "Ardiansyah", "Ummu", "Sa'adah").stream()
                .peek(name -> System.out.println("Before change name to upper: " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("Change name to upper: " + upper))
                .forEach(name -> System.out.println("Final name: " + name));
    }
}
