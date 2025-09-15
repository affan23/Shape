package Project2.s.Shape;

public class Dikdortgen implements IIslem {

    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    public double alanHesapla() {

        return uzunKenar*kisaKenar;
    }

    @Override
    public double cevreHesapla() {

        return 2*(uzunKenar+kisaKenar);
    }

    // TODO Bu class doldurunuz
}
