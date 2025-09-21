package enigma.camp.application;

import enigma.camp.data.BangunDatar;
import enigma.camp.data.Lingkaran;
import enigma.camp.data.Persegi;
import enigma.camp.data.PersegiPanjang;

public class SoalBangunDatarAbstract {
    public static void main(String[] args) {
        BangunDatar[] bangunDatarList = {
            new Lingkaran(7.0),
            new Persegi(5.0),
            new PersegiPanjang(8.0, 4.0)
        };

        for (BangunDatar bangunDatar : bangunDatarList) {
            System.out.println("=== " + bangunDatar.getClass().getSimpleName() + " ===");
            System.out.println("Luas        : " + bangunDatar.getLuas());
            System.out.println("Keliling    : " + bangunDatar.getKeliling());
            System.out.println();
        }
    }
}
