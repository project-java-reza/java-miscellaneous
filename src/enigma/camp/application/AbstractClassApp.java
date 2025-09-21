package enigma.camp.application;

import enigma.camp.data.City;
import enigma.camp.data.Location;

public class AbstractClassApp {
    public static void main(String[] args) {

        // var location = new Location(); ERROR
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
