package enigma.camp.data;

public class Avanza implements Car {
    @Override
    public void drive() {
        System.out.println("Avanza drive");
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

}
