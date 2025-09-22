package enigma.camp.application;

import enigma.camp.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // with method reference static
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("reza")); // true
        System.out.println(predicateIsLowerCase.test("Reza")); // false

        // method reference parameter
        Function<String, String> function = String::toUpperCase;

        System.out.println(function.apply("reza")); // REZA

    }

    // method reference non static
    public void run() {
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("reza")); // true
        System.out.println(predicateIsLowerCase.test("Reza")); // false
    }

    // method reference object
    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();

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
