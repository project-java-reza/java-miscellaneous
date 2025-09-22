package enigma.camp.application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Rizqi");
        collection.add("Reza");
        collection.add("Ardiansyah");
        collection.addAll(List.of("Ummu", "Sa'adah"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");
        collection.remove("Ardiansyah");
        collection.removeAll(List.of("Rizqi", "Reza"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(collection.contains("Ardiansyah"));
        System.out.println(collection.containsAll(List.of("Ummu", "Sa'adah")));
        System.out.println(collection.size());
    }
}
