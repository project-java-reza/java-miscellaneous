package com.enigmacamp.java.maven.app;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

//    @Test
//    void testCreateStreamPipelineJarangDigunakan() {
//        // JARANG DIGUNAKAN
//        List<String> list = List.of("Rizqi", "Reza", "Ardiansyah");
//        Stream<String> stream = list.stream();
//        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());
//        Stream<String> streamMr = streamUpper.map(upper -> "Mr. " + upper);
//        streamMr.forEach(System.out::println);
//    }

    @Test
    void testCreateStreamPipeline() {
        List.of("Rizqi", "Reza", "Ardiansyah").stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr. " + upper)
                .forEach(mr -> System.out.println(mr));
    }

}
