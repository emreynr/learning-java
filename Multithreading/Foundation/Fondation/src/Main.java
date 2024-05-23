import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*

        multitherading kisaca bir program icinde birden fazla is parcaciginin ayni anda calismasi anlamina gelir
        boylece zamandan da tasarruf edilmis olur

        Multitasking

            coklu gorev, birden fazla gorevin ayni anda yurutulmesi anlamina gelir.
            bu coklu gorevler yani multitasking iki sekilde gerceklestirilir;

                Process-bases multitasking (Mutliprocessing);
                    - her islemin hafizada bir yeri vardir, yani her ilem icin hafizada ayri bir yer acilir
                    - agir bir surec, yani yorucu olur cpu icin
                    - processler arasindaki iletisim maaliyeti yuksektir
                    - bir process uzerinden baska bir process uzerine gecis islemi zahmetlidir
                    bu gecis islemi icin hafizadaki kayitlar guncellenir, kayitli veriler yuklenir vs ozetle
                    processler arasi gecis zahmetlidir

                Thread-Based Multitasking (Multithreading);
                    - threadler hafizada ayni adresi paylasirlar, process-based icin durum farkliydi
                    - bir threadin yuku cok hafiftir
                    - threadler arasindaki iletisim maaliyeti cok dusuktur
                    - threadler, en kucuk is parcacigi birimidir.
                    - threadlerdeki bir diger ozellike ege bir thread bir istisna dondururse bu sadece o
                    threadi ilgilendirir, diger threadler bu istisnadan etkilenmez

        Java thread classi;
        javada threadlari gerceklestirebilmek icin thread classindan obje olusturmak gerekir.
        thread classi, Object classini extends eder ve runnable interface'ini implement eder.
         */

        // DemoMultithreading classindan sonra threadlari okuyoruz
        System.out.print("kac adet thread olsun? :");
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            // diger classtan obje olusturma
            DemoMultithreading dm = new DemoMultithreading();
            dm.start(); // threadi baslatiyoruz
        }
    }
}