public class Main {

    public static void main(String[] args) {

        /*

        threadler genel olarak hafif islemler olarak adlandirlilabilir.
        threadi surec icinde olusturmak ve kullanmak cok daha az kaynak tuketir.
        javada main thread, program baslatildiginda ilk baslayan threadtir.

        iki farkli yontemle threadler icin isim atamasi yapabiliriz.
            1 - thread olusturulmasi ve threadin adinin iletilmesi;
            baslangicta threadler icin isim olusturmasakta java bunlar icin
            otomatik isim tanimlamasi yapar. thread-0 thread-1 diye gider.
            ikinci yontem baska bir programda yapilacak

         */

        // ilk yonteme gore thread isimlendirme

        //ThreadNaming classindan referans olusuturuyoruz
        ThreadNaming thread1 = new ThreadNaming("thread1");
        ThreadNaming thread2 = new ThreadNaming("thread2");

        // get ile isimleri alma
        System.out.println("thread 1 name: " + thread1.getName());
        System.out.println("thread 2 name: " + thread2.getName());

        //threadleri baslatma
        thread1.start();
        thread2.start();
        // start() ile threadi calistirdiktan sonra ThreadNaming classi altindaki
        // run() metodu calisacak

        /*
        ikinci yontem ise setNmae() metodu, bunu daha once yaptim
        ayni zamanda currentThread() ile suanda hangi threadin calistigini
        gorebiliyorduk
         */

        System.out.println("current thread: " + Thread.currentThread());


    }
}