package enigma.camp.application;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("Reza", "Reza");
        sortedMap.put("Ummu", "Ummu");
        sortedMap.put("Ardiansyah", "Ardiansyah");

        for (var key : sortedMap.keySet()) {
            System.out.println(key); // hasil terurut sesuai abjad
        }

    }
}
