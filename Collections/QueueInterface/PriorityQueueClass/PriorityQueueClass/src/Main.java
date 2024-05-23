import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main(String[] args) {
        /*

       PriorityQueue  Queue classinda oldugu gibi FIFO yani ilk giren ilk
       cikan prensibi ilke alir fakat burada ek olarak;
       bazi ozel durumlarda bazi elementlerin once gelmesi gerekebilir
       bu durumda PriorityQueue kullanilir.
       Hastane ornegi;
       belirli bir hasta sirasi var hastalar sirayla doktorun odasina giriyor
       fakat yasli biri geldiginde bekleme sirasinin onune gecebilir ve priortiyQueue
       ornegidir.

       onemli PriotiryQueue ozellikleri;
       - null bir deger izin vermez yani bos olamaz
       - karsilastirma olmali ki prioritryqueue olsun yoksa kimin one gececegine
         yani karsiastirmali durumlar olmali
       - priorityqueue iliskisiz kuyruklardir
       - priorityqueue is parcacigi acisindan guvenli degildir, bu sebeple coklu is parcaliklari
       soz konusu oldugunda java BlockingQueue interface uzerideki PriorityBlockingQueue classini uygular
       - cogunda oldugu gibi kuyruktan eleman cikarma ekleme gibi yapilara izin verir
         */

        // temel bir PriotrityQueue

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(21);
        queue.add(32);
        queue.add(99);
        queue.add(344);

        System.out.println(queue.peek());
        // peek() ile queue icinde bulunan top element alinir, yani ilk eleman
        // burada aklinda olsun queue bir tree yapisi gibi calisir yani top derken
        // agacin en ustundeki deger ilk degerdir

        System.out.println(queue.poll());
        // top elementi yani ilk elemani alir ve yazdirir, yazdirdiktan sonra
        // bunu queue icinden siler

        System.out.println(queue.peek()); // 21 i sildikten sonra top eleman 32 olur

        System.out.println(queue);

        queue.remove(); // eleman belirtilmezse top elemani siler
        queue.remove(344); // belirtilen elemani siler

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(1);
        pq.add(32);
        pq.add(34);
        pq.add(23);

        System.out.println("queue's contents are here: " + pq);

        int element = pq.element(); // top element yazdirmanin farkli bir yolu
        System.out.println("accessed element: " + element);

        System.out.println("queue's size: " + pq.size());

        pq.clear(); // butun elementleri siler

        System.out.println("is the queue empty? " + pq.isEmpty());
        // isEmpty() ile bos olup olmadigini boolean ile kontrol eder

        System.out.println("contains? " + pq.contains(23)); // 23 var mi yok mu boolean ile kontrol eder




    }
}