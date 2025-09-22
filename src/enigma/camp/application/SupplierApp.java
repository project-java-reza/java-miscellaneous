package enigma.camp.application;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        // with lambda
        Supplier<String> supplier = () -> "Rizqi Reza Ardiansyah";

        System.out.println(supplier.get());

    }
}
