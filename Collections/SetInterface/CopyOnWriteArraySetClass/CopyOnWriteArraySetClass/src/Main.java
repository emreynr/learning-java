import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main extends Thread {

     static CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();

     /*

     Set'ın thread-sade versıyonu olarak gecer, threadler ıle bırlıkle kullanılır.
     bu classı kullanabılmek ıcın concurrent packageden ımport etmek gerekıyor.
     uygulama olarak sadece CopyOnWriteArrayList ile kullanılabılır.
     bırden cok ıs parcacıgı, guncelleme ıslemlerını aynı anda gerceklestırebılır ancak
     her guncelleme ıslemı ıcın ayrı bır klonlanmıs kopya olusturur. her guncelleme de oldugu gıbı
     yenı bır klonlanmıs kopya olusacak ve bu da malıyetlı bır ıslem olur. bu sebeple bırden
     fazla guncelleme ıslemı gerekıyorsa CopyOnWriteArraySet kullanılması onerılmez
     gelıstırıcı tarafından kontrol edılen senkronızasyon adımlarının en aza ındırılmesıne ve kontrolun
     yerlesık ıyı test edılmıs API lere tasınmasına yardımcı olur.
     
      */



     // sub-thread ıle element ekleme
     // thread ıle ıslem yapılacagı ıcın threadlerden extends edıyoruz
     public void run() {
        copyOnWriteArraySet.add("david");
    }


    public static void main(String[] args) {

        /*

         */


        // add() metodu ıle element ekleme
        copyOnWriteArraySet.add("michael");
        copyOnWriteArraySet.add("test");
        copyOnWriteArraySet.add("sarah");


        // Maın classından obje olusturuyoruz, threadlerı kullanabılmek ıcın
        Main t = new Main();

        // yazılan sub-threadı calıstırıyoruz
        t.start();

        //try catch, try ıle ıstısna kontrolu yapıyoruz
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            System.out.println("sub-thread bır element ekleyecek");
        }
        System.out.println(copyOnWriteArraySet);

        Iterator itr = copyOnWriteArraySet.iterator();

        while(itr.hasNext()) {
            String s = (String)itr.next();
            System.out.println(s);

            if (s.equals("sarah"))  {
                itr.remove();
            }
        }
    }
}