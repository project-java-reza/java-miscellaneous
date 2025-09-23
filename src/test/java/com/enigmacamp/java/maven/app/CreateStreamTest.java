package com.enigmacamp.java.maven.app;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> System.out.println(data)); // no output

        Stream<String> oneStream = Stream.of("Reza");
        oneStream.forEach(data -> System.out.println(data)); // output: Reza

        String data = "Ardiansyah";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> System.out.println(item)); // output: Ardiansyah

    }

    @Test
    void testCreateFromArray() {
        Stream<String> arrayStream = Stream.of("Rizqi", "Reza", "Ardiansyah");
        arrayStream.forEach(name -> System.out.println(name)); // output: Rizqi Reza Ardiansyah

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream.forEach(System.out::println); // output: 1 2 3 4 5 6 7 8 9 10

        String[] array = new String[] {"Ummu", "Sa'adah"};
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println); // output: Ummu Sa'adah
    }

    @Test
    void testCreateFromCollection() {
        Collection<String> collectionString = List.of("Rizqi", "Reza", "Ardiansyah");
        Stream<String> streamString = collectionString.stream();
        streamString.forEach(System.out::println); // output: Rizqi Reza Ardiansyah
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Enigma Camp");
        //stream.forEach(System.out::println); // infinite stream, will print forever

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        iterate.limit(10).forEach(System.out::println); // output: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    }
}
