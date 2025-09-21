package enigma.camp.application;

import enigma.camp.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Indomie", 2000);

        System.out.println(product.getName());
        System.out.println(product.getPrice());

    }
}
