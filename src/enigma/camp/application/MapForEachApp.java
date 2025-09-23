package enigma.camp.application;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("first_name", "Rizqi");
        map.put("middle_name", "Reza");
        map.put("last_name", "Ardiansyah");

        // for loop
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("===================");

        // forEach Anonymous Class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        System.out.println("===================");

        // forEach Lambda
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

    }
}
