package enigma.camp.application;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("Ardiansyah");
        strings.add("Reza");
        strings.add(" Ummu");

        strings.set(0, "Rizqi");

        strings.remove(0);

        for (var name : strings) {
            System.out.print(name);
        }
    }
}
