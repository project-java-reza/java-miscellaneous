package enigma.camp.data;

public class Manusia implements SoalBerhitung{
    private String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int penjumlahan(int angka1, int angka2) {
        return angka1 * angka2;
    }

    @Override
    public int perkalian(int angka1, int angka2) {
        return angka1 * angka2;
    }
}
