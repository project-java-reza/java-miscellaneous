package enigma.camp.application;

import enigma.camp.data.Manusia;

public class SoalBerhitungInterface {
    public static void main(String[] args) {
        Manusia manusia = new Manusia("Reza");

        // memanggil method penjumlahan
        int hasilTambah = manusia.penjumlahan(10, 15);

        // memanggil method perkalian
        int hasilKali = manusia.perkalian(2, 3);

        System.out.println(hasilTambah);
        System.out.println(hasilKali);
    }
}
