import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class moreBlockingQueue3 {

    public static void main(String[] args) {

        // BlockingQueue<Integer> queue = new ArrayBlockingQueue<>();
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        queue.add(12);
        queue.add(1);
        queue.add(32);
        queue.add(99);
        queue.add(54);

        // iterator ile queue uzerınde verılere gezınme
        Iterator<Integer> iterator = queue.iterator();

        System.out.print("here are queue's elements: ");
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(iterator.next() + " ");
        }
    }
}
