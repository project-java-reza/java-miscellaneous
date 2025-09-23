package com.enigmacamp.java.maven.app;

import java.util.List;

public class PaginateApp {
    public static void main(String[] args) {
        List<String> data = List.of("Apple", "Banana", "Cherry", "Durian", "Elderberry", "Fig");
        int jumlahHalaman = 2;
        paginate(data, jumlahHalaman, 1);

    }

    public static void paginate(List<String> data, int jumlahHalaman, int halamanParameter) {
       int awalIndeks = (halamanParameter - 1) * jumlahHalaman;
       int akhirIndeks = Math.min(awalIndeks + jumlahHalaman, data.size());

       if (awalIndeks >= data.size()) {
              System.out.println("Halaman " + halamanParameter + ": Halaman tidak tersedia.");
         } else {
              List<String> halaman = data.subList(awalIndeks, akhirIndeks);
              System.out.println("Halaman " + halamanParameter + ": " + halaman);
       }
    }
}
