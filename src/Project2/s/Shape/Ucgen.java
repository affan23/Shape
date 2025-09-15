package Project2.s.Shape;

public class Ucgen implements IIslem {

    private double kenar1;
    private double kenar2;
    private double kenar3;

    public Ucgen(double kenar1, double kenar2, double kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }


    @Override
    public double alanHesapla() {

        double cevre = kenar1+kenar2+kenar3;
        return Math.sqrt(cevreHesapla()/2 * (cevreHesapla()/2-kenar1) * (cevreHesapla()/2-kenar2)*(cevreHesapla()/2-kenar3));
    }

    @Override
    public double cevreHesapla() {
        return kenar1 + kenar2 + kenar3;
    }

    // TODO Bu class doldurunuz


}
