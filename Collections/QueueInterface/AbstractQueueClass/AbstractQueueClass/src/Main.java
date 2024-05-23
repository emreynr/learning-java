import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {

        /*
        abstractQueue bazi queue islemleri icin iskelet gorevi gorur.
        ana uygulama bos ogelere izin vermedigi zaman.
        tek fark, yanlis veya bos donusler hata yerine ilgili istisnayi atar

         */

        AbstractQueue<Integer> queue = new LinkedBlockingDeque<>();

        queue.add(12);
        queue.add(21);
        queue.add(31);
        queue.add(99);

        System.out.println("abstractin contains: " + queue);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // bir queuedeki elemanlari baska bir queue icine ekleme

        AbstractQueue<Integer> queue1 = new LinkedBlockingDeque<>();

        queue1.add(31);
        queue.add(88);
        queue.add(54);
        queue.add(1);
        queue.add(2);

        queue.addAll(queue1);
        // queue icine queue1 icindeki tum elemanlari ekler
        System.out.println(queue);
        // yalniz ayni elemanlari da iki kez ekrana bastiriyor
        System.out.println(queue1); // bu sekide ekledikten sonra queue1 icndeki KOPYA olmayan elemanlar haric hepsini siliyor. take() metodu gibi dusun elemani oradan kesiyor

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        queue.remove();  // default olarak top eleman hangisi ise onu yani ilk elemani siler
        queue.remove(2);  // varsa 2 elementini siler

        System.out.println(queue);
        System.out.println(queue.element()); // bu sekilde de top elemani alabiliiz




    }
}