package enigma.camp.application;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Rizqi", "Reza", "Ardiansyah");

        // for loop
        for (var value : list) {
            System.out.println(value);
        }

        // forEach Anonymous Class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // forEach Lambda
        list.forEach(value -> System.out.println(value));

        // forEach Method Reference
        list.forEach(System.out::println);
    }
}
