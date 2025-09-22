package enigma.camp.application;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        // with lambda
        Function<String, Integer> functionLength = value -> value.length();

        System.out.println(functionLength.apply("Hello, World!")); // Output: 13

    }
}
