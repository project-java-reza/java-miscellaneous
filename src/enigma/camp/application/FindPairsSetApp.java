package enigma.camp.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairsSetApp {
    public static void main(String[] args) {
        int[] angkas = {2, 4, 5, 1, 3, 5, 7, 8, 9, 6, 10};
        int k = 10;
        findPairsSet(angkas, k);
    }

    public static void findPairsSet(int[] arr, int k) {
        Set<Integer> terlihat = new HashSet<>();
        List<String> hasil = new ArrayList<>();
        Set<Integer> perbedaan = new HashSet<>();

        for (int angka : arr) {
            int melengkapi = k - angka;
            if (terlihat.contains(melengkapi) && !perbedaan.contains(Math.abs(melengkapi - angka))) {
                hasil.add("(" + angka + " " + melengkapi + ")");
                perbedaan.add(Math.abs(melengkapi - angka));
            }
            terlihat.add(angka);
        }

        if (hasil.isEmpty()) {
            System.out.println("Tidak ada pasangan yang ditemukan");
        } else {
            String keluaran = String.join(" ", hasil);
            System.out.println(keluaran);
        }
    }
}
