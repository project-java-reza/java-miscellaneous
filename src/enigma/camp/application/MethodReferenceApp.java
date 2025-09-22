package enigma.camp.application;

import enigma.camp.util.StringUtil;

import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // with method reference
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("reza")); // true
        System.out.println(predicateIsLowerCase.test("Reza")); // false

    }
}
