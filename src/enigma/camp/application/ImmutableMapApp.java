package enigma.camp.application;

import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> name = Map.of(
         "firstName", "Rizqi",
         "middleName", "Reza",
         "lastName", "Ardiansyah"
        );

        name.put("middleName", "Marfuah"); // error

    }
}
