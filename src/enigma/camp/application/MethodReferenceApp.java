package enigma.camp.application;

import enigma.camp.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // with method reference
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("reza")); // true
        System.out.println(predicateIsLowerCase.test("Reza")); // false

        Function<String, String> function = String::toUpperCase;

        System.out.println(function.apply("reza")); // REZA

    }

    public void run() {
        // with method reference to non static method
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("reza")); // true
        System.out.println(predicateIsLowerCase.test("Reza")); // false
    }

    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();

        // with method reference to non static method
        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("reza")); // true
        System.out.println(predicateIsLowerCase.test("Reza")); // false
    }

    // non static method
    public boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
