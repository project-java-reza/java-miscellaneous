package enigma.camp.data;

public class Lingkaran extends BangunDatar{
    private Double jariJari;

    public Lingkaran(Double jariJari) {
        this.jariJari = jariJari;
        setLuas(hitungLuas());
        setKeliling(hitungKeliling());
    }

    @Override
    public Double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public Double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public Double getJariJari() {
        return jariJari;
    }

    public void setJariJari(Double jariJari) {
        this.jariJari = jariJari;
        setLuas(hitungLuas());
        setKeliling(hitungKeliling());
    }
}
