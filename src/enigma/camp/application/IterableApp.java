package enigma.camp.application;


import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Rizqi", "Reza", "Ardiansyah");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
