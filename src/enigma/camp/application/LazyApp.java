package enigma.camp.application;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(70, () -> getName());
    }

    public static void testScore(int score, Supplier<String> name) {
        if (score >= 80) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Reza";
    }
}
