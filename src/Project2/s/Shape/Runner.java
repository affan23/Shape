package Project2.s.Shape;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sekil;

    do {
        System.out.println("1. Kare");
        System.out.println("2. Dikdortgen");
        System.out.println("3. Daire");
        System.out.println("4. Ucgen");
        System.out.println("Hangi sekil (1-4) : ");
        sekil = scanner.nextInt();

        // TODO Bu class doldurunuz

        IIslem islem = null;

        switch (sekil) {
            case 1:
                System.out.println("Kenar giriniz :");
                double kenar = scanner.nextDouble();
                islem = new Kare(kenar);
                break;
            case 2:
                System.out.println("uzun kenar");
                double uzunKenar = scanner.nextDouble();
                System.out.println("Kisa kenar");
                double kisaKenar = scanner.nextDouble();
                islem = new Dikdortgen(kisaKenar, uzunKenar);
                break;
            case 3:
                System.out.println("Dairenin yari capini girin :");
                double yariCap = scanner.nextDouble();
                islem = new Daire(yariCap);
                break;
            case 4:
                System.out.println("1.Kenar girin");
                double kenar1 = scanner.nextDouble();
                System.out.println("2.Kenar girin");
                double kenar2 = scanner.nextDouble();
                System.out.println("3.Kenar girin");
                double kenar3 = scanner.nextDouble();
                islem = new Ucgen(kenar1,kenar2,kenar3);
                break;
            case 0 :
                System.out.println("Cikis yapiliyor");
                break;
            default:
                System.out.println("yanlis giris");

        }

        if (islem != null){
            System.out.println(" Cevre " + islem.cevreHesapla());
            System.out.println(" Alan" + islem.alanHesapla());
        }
        System.out.println();
    }while (sekil != 0);


    }
}
