import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class moreBlockingQueue {

    public static void main(String[] args) throws InterruptedException {
        // olusabilecek bir istisna icin istinsa olusturuyoruz

        int capacity = 12;

        BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(capacity);
        // kapasiteleri bir blockingqueue olusturma
        bq.add(12);
        bq.add(21);
        bq.add(99);
        bq.add(32);
        bq.add(91);

        System.out.println("queue is here: " + bq);

        // queue uzerinden eleman silme, 12 yi siler
        bq.remove();
        System.out.println(bq);

        bq.remove(); // 21 i siler
        System.out.println(bq);

        // put methodu kullanarak eleman ekleme
        bq.put(31); // en sona 31 i ekler
        System.out.println(bq);
        bq.put(66); // 31 den sonra 66 yi ekler, yani en son 66

        System.out.println("updated queue: " + bq);

        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println(bq);

        if (bq.contains(31)) {
            System.out.println("bq contains 31 ");
        }
        else {
            System.out.println("no such element exists");
        }

        System.out.println("the element of bq: " + bq.size());

        System.out.println(bq.remove(31));
        // spesifik olarak 31 i bulup siler

        System.out.println(bq.remove());
        // top elemani siler yani ilk element: 12 ( yukaridaki gibi ozellikle element belirtilmezse)

        System.out.println(bq);

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        // iterator araylist hashlist gibi classlar icin dongu gorevi gorur

        Iterator<Integer> loop = bq.iterator();
        System.out.println("bq contains: ");

        // for ile bastirmak icin iterator ile tanimlama yapmak gerek
        for (int i = 0; i < bq.size(); i++) {  // iterator olmadan direkt size() ile kullanamazsin
            System.out.print(loop.next() + " ");
        }
    }
}