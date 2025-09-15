package Project2.s.Shape;

public class Daire implements IIslem {

    private double yariCap;

    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double alanHesapla() {
        return Math.PI *yariCap *yariCap;
    }

    @Override
    public double cevreHesapla() {
        return 2 * Math.PI * yariCap;
    }

    // TODO Bu class doldurunuz
}
