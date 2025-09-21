package enigma.camp.data;

public class PersegiPanjang extends BangunDatar {
    private Double panjang;
    private Double lebar;

    public PersegiPanjang(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        setLuas(hitungLuas());
        setKeliling(hitungKeliling());
    }

    @Override
    public Double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public Double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public Double getPanjang() {
        return panjang;
    }

    public void setPanjang(Double panjang) {
        this.panjang = panjang;
        setLuas(hitungLuas());
        setKeliling(hitungKeliling());
    }

    public Double getLebar() {
        return lebar;
    }

    public void setLebar(Double lebar) {
        this.lebar = lebar;
        setLuas(hitungLuas());
        setKeliling(hitungKeliling());
    }
}
