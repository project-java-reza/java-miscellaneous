package enigma.camp.application;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("reza");

        String name = null;
        sayHello(name); // this will not throw NullPointerException
    }

    public static void sayHello(String name) {
//        Optional.ofNullable(name)
//                // method reference
//                .map(String::toUpperCase)
//                .ifPresentOrElse(value -> System.out.println("HELLO " + value),
//                        () -> System.out.println("HELLO"));

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElseGet(() -> "TEMAN");
        System.out.println("HELLO " + upperName);
    }
}
