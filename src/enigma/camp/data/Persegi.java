package enigma.camp.data;

public class Persegi extends BangunDatar{
    private Double sisi;

    public Persegi(Double sisi) {
        this.sisi = sisi;
        setLuas(hitungLuas());
        setKeliling(hitungKeliling());
    }

    @Override
    public Double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public Double hitungKeliling() {
        return 4 * sisi;
    }

    public Double getSisi() {
        return sisi;
    }

    public void setSisi(Double sisi) {
        this.sisi = sisi;
        setLuas(hitungLuas());
        setKeliling(hitungKeliling());
    }
}
