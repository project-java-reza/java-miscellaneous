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
        Optional.ofNullable(name)
                // method reference
                .map(String::toUpperCase)
                .ifPresent(value -> System.out.println("HELLO " + value) );
    }
}
