import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class moreQueue4 {

    public static void main(String[] args) throws InterruptedException {

        // blocking queue ile isim ekleme cekme programı

        int capacityOfQueue = 5;

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(capacityOfQueue);
        // linkedBlockingQueue ile limit belirmek zorunda değiliz, array ile tanımlarken zorundayız

        queue.add(12);
        queue.add(21);
        queue.add(0);
        queue.add(2);

        // queue ıcındekı elemanları bastırır
        System.out.println("items in queue are: " + queue);

        int deletedItem = queue.take();
        // take() i kullanabılmek InterrupedException istisnasını yakalama kullanmalıyız (throws ıle yapılabılır)

        // first deleted item
        System.out.println("deleted item no1: " + deletedItem);

        System.out.println(queue);



    }
}
