package enigma.camp.data;

import java.util.Objects;

public class Product {
    public String name;
    public int price;

    public Product() {

    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Product)) {
            return false;
        }

        Product product = (Product) o;

        if (this.price != product.price) {
            return false;
        }

        if (this.name != null) {
            return this.name.equals(product.name);
        } else {
            return product.name == null;
        }
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    public String toString() {
        return "Product name: " + name + "', price: " + price;
    }
}
