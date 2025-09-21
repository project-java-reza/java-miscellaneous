package enigma.camp.application;

import enigma.camp.data.Avanza;
import enigma.camp.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
        System.out.println(car.getBrand());
    }
}
