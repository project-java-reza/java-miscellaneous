package enigma.camp.application;

import enigma.camp.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("reza", null);
        System.out.println("Sukses connect ke database");
    }

    public static void connectDatabase(String username, String password) {
       if (username == null || password == null) {
              throw new DatabaseError("Tidak bisa connect ke database karena username atau password null");
       }
    }
}
