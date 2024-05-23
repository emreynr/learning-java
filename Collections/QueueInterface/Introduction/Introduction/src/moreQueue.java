import java.util.PriorityQueue;
import java.util.Queue;

public class moreQueue {

    public static void main(String[] args) {

        //PrioıtyQueue

        Queue<Integer> queue1 = new PriorityQueue<Integer>();

        queue1.add(12);
        queue1.add(21);
        queue1.add(33);
        queue1.add(99);
        queue1.add(88);

        // top elementı yazdırır yanı ılk eleman
        System.out.println(queue1.peek());

        // ılk elemanı yazdırır ve ve onu queue ıcınden sıler
        // sıldıgı elemanı da gosterır
        System.out.println(queue1.poll());

        // tekrardan ılk elemanı yazdırma
        // artık 12 sılındı ve top eleman 21 oldu
        System.out.println(queue1.peek());

        System.out.print(queue1 + " ");







    }
}
