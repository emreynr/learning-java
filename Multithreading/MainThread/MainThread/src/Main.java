import java.util.Scanner;

public class Main extends  Thread{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        javadakı fazla olan threadler ıcın coklu destek saglar. javada bır program calısmaya basladıgında
        bır thread hemen calısmaya baslar. bu genellıkle Maın Thread olur cunku program calısmaya basladıgı
        gıbı maın thread calısmaya baslar.

        Maın Thread nasıl kontrol edılır?
        program calısmaya basladıgında maın threadte hemen calısmaya baslar. bunu kontrol edebılmek ıcın
        bır referans olusturulmalı. currentThread() ıle suankı maın thread hangısı oldugunu ogrenebılırız.
        maın threadın varsayılan oncelık degerı 5 tır.


         */

        // main thread kullanımına uygun bır program

        //main thread icin referans olusturuyoruz
        Thread t1 = Thread.currentThread();

        // maın thread name degerını alma
        System.out.println("current thread: " + t1.getName());

        // maın thread name degerı degıstrme
        t1.setName("david thread");
        System.out.println("after name change: " + t1);

        //maın thread ıcın oncelık sırasını ogrenme
        System.out.println("main thread prıorıty; " + t1.getPriority()); // default 5 olur demıstık

        // oncelık degerını maxımuma alma
        t1.setPriority(Thread.MAX_PRIORITY); // onem sırası 1 den 10 a kadar artar.

        System.out.println("main thread new prorıty value: " + t1.getPriority());

        for ( int i = 0; i < 5; i++) {
            System.out.println("main thread: ");
        }

        // maın thread, sub thread olusturur
        Thread subt = new Thread() {
            // thread ıcın run() metodu
            public void run () {
                for (int i = 0; i < 5; i++) {
                    System.out.println("sub/helper thread");
                }
            }
        };

        // sub thread ıcın oncelık degerını alma
        System.out.println("sub thread priority: " + subt.getPriority());

        // sub thread ıcın min oncelık ataması yapma
        subt.setPriority(Thread.MIN_PRIORITY);

        System.out.println("new sub thread priority: " + subt.getPriority());

        // sub threadı baslatma
        subt.start();





    }
}