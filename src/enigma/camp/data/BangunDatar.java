package enigma.camp.data;

public abstract class BangunDatar {
    private Double luas;
    private Double keliling;

   public abstract Double hitungLuas();
   public abstract  Double hitungKeliling();

    public Double getLuas() {
        return luas;
    }

    public void setLuas(Double luas) {
        this.luas = luas;
    }

    public Double getKeliling() {
        return keliling;
    }

    public void setKeliling(Double keliling) {
        this.keliling = keliling;
    }
}
