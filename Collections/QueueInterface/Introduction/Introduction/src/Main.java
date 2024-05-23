import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
// https://www.programiz.com/java-programming/queue
// https://www.geeksforgeeks.org/queue-data-structure/?ref=lbp
// burada syntax kullanimi ile ilgili cok guzel ornekler vermis
public class Main {

    public static void main(String[] args) {
         /*

         bu yapıda ılk gıren ılk cıkar yapısı benımsenır.
         queue ınterface'i cok cesıtlı classlar tarafından uygulanabılır;
         LınkedLıst, ArrayDeque, ve PrıoıtyQueue tarafından uygulanabılır. yukarı en alt lınkte ornegı var
         kullanım amacı belırlı sayıdakı ogelerı belırlı bır sırayla yonetmektır

          */
        Queue<Integer> queue = new PriorityQueue<>(); //PrıorıtyQueue classı kullanıldı


        Queue<String> queue1 = new LinkedList<String>(); // LınkedLıst classı kullanarak Queue olusturma
        queue1.add("david");
        queue1.add("michael");
        queue1.add("sarah");
        queue1.add("bro"); // eleman eklemE

        System.out.println("here is the queue: " + queue1);

        // sıranın onunden eleman sılme
        String front = queue1.remove();

        // bunu hangı sıradakı elemanın sılındıgını gormek icin yapıyoruz
        System.out.println("removed element: " + front); // ilk eleman sılınır

        System.out.println("updated queue:" + queue1);

        queue1.add("newItem");

        String peeked = queue1.peek();
        System.out.println("peeked element: " + peeked);

        System.out.println("queue after peek: " + queue1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Queue<Integer> q = new LinkedList<Integer>();

        int loop = 12; // 12 eleman eklensın

        for ( int i = 0; i < 12; i++) {
            q.add(i); // her bir i degerini ekler
        }
        System.out.print("queue here: " + q + " ");
        System.out.println();

        // queue basındakı elemanı sıler
        int remove = q.remove();
        System.out.println("removed element: " + remove);

        System.out.print(q + " ");
        System.out.println();

        // queue nın basındakı elemanını goster
        int head = q.peek();
        System.out.println("head of queue: " + head);

        System.out.println("size of queue: " + q.size());

        /*
        sadece sılınen ya da peeked olan elemanları gormek ıcın
        bazı cıkları alıyoruz. yanı queue nın nasıl calıstıgını anlamak
        ıcın. yoksa tabıkı boyle gostermeye gerek yok

        Queue, FIFO konseptini takip eder, yani ilk giren ilk cıkar
         */



















    }
}