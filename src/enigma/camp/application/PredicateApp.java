package enigma.camp.application;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        // with lambda
        Predicate<String> predicateCheckBlank = value -> value.isBlank();

        System.out.println(predicateCheckBlank.test(" ")); // true
        System.out.println(predicateCheckBlank.test("Reza")); // false

    }
}
