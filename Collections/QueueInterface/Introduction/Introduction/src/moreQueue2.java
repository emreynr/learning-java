import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class moreQueue2 {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityBlockingQueue<Integer>();

        queue.add(12);
        queue.add(21);
        queue.add(55);
        queue.add(99);

        // top elementi yazdırma
        System.out.println(queue.peek());

        // pol yontemı ıle top elementı yazdırıp bunu lısteden sılme ıslemı
        System.out.println(queue.poll());

        System.out.println(queue + " ");

    }
}
