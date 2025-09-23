package com.enigmacamp.java.maven.app;

import java.util.List;

public class PaginateApp {
    public static void main(String[] args) {
        List<String> data = List.of("Apple", "Banana", "Cherry", "Durian", "Elderberry", "Fig");
        int jumlahDataHalaman = 2;
        paginate(data, jumlahDataHalaman, 1);

    }

    public static void paginate(List<String> data, int jumlahDataHalaman, int halamanDiminta) {
       int awalIndeks = (halamanDiminta - 1) * jumlahDataHalaman;
       int akhirIndeks = Math.min(awalIndeks + jumlahDataHalaman, data.size());

       if (awalIndeks >= data.size()) {
              System.out.println("Halaman " + halamanDiminta+ ": Halaman tidak tersedia.");
         } else {
              List<String> halaman = data.subList(awalIndeks, akhirIndeks);
              System.out.println("Halaman " + halamanDiminta+ ": " + halaman);
       }
    }
}
