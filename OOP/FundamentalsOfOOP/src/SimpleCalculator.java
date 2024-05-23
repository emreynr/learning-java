import java.util.Scanner;

public class SimpleCalculator {


    static void kare(int kenarUzunluk) {

        int alan = kenarUzunluk * 2;
        int cevre = kenarUzunluk * 4;
        System.out.println("alan: " + alan + ", cevre: " + cevre);
    }
    static void dikdortgen(int kisa, int uzun) {
        int alan = kisa * uzun;
        int cevre = kisa * 2 + uzun * 2;
        System.out.println("sirasiyla alan ve cevre: " + alan + ", " + cevre);
    }

    static void daire(double yaricap) {
        double alan = Math.PI * yaricap * yaricap;
        System.out.println("daire alan: " + alan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // kare daire ve aklima gelen birkac tane daha seklin alanini veya cevresini hesaplama
        // tek bir sinif altinda degil her biri icin ayri ayri metodlar yazacaksin. while ile kullan

        String  islemler = " 1- kare"
                + " 2 - dikdortgen "
                + " 3 - daire "
                + " 4 - cikis";

        while(true) {

            System.out.println(islemler);

            System.out.print("yapilmak istenen islem: ");
            String istenen = scanner.nextLine();

            if (istenen.equals("1")) {
                System.out.print(" kenar uzunlugunu gir: ");
                int uzunluk = scanner.nextInt();
                if (uzunluk <= 0) {
                    System.out.println("uzunluk negatif olamaz");
                    continue;
                }
                kare(uzunluk);
            }
            else if (istenen.equals("2")) {
                System.out.print("kisa kenar: ");
                int kisa = scanner.nextInt();
                System.out.print("uzun kenar: ");
                int uzun = scanner.nextInt();

                if (kisa <= 0 || uzun <= 0) {
                    System.out.println("uzunluk negatif olmasin.");
                    continue;
                }
                dikdortgen(kisa, uzun);
            }
            else if (istenen.equals("3")) {
                System.out.print("yaricap: ");
                double yaricap = scanner.nextDouble();

                if (yaricap <= 0) {
                    System.out.println("eksi olmasin");
                    continue;
                }
                daire(yaricap);
            }
            else if (istenen.equals("4")) {
                System.out.println("cikis yapiliyor");
                break;
            }
        }
    }
}
