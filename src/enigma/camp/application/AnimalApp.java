package enigma.camp.application;

import enigma.camp.data.Animal;
import enigma.camp.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
