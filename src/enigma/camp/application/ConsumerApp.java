package enigma.camp.application;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        // dengan lambda expression
        Consumer<String> consumer = value -> System.out.println(value);

        consumer.accept("Rizqi Reza Ardiansyah");

    }
}
