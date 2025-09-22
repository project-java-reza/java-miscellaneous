package enigma.camp.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        //Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("Rizqi");
        names.add("Reza");
        names.add("Ardiansyah");
        names.add("Ummu");
        names.add("Sa'adah");
        names.add("Ardiansyah");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
