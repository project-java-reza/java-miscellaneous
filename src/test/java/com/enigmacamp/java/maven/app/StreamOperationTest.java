package com.enigmacamp.java.maven.app;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation() {
        List<String> names = List.of("Rizqi", "Reza", "Ardiansyah");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase());

        streamUpper.forEach(System.out::println);

        names.forEach(System.out::println);
    }

}
