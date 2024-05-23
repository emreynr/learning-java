import java.util.LinkedList;
import java.util.Queue;

public class moreQueue1 {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(12);
        queue.add(32);
        queue.add(21);
        queue.add(66);
        queue.add(77);

        // linkedlistin ilk elemanını yazdırır
        System.out.println(queue.peek());

        // ilk elemanı yazdırır ve ve bunu lısteden sıler
        System.out.println(queue.poll());

        //tekradan top elementı yazdırma
        System.out.println(queue.peek());

        System.out.print(queue + " ");

        // neden top element 12 cunku Fırst ın Fırst Out prensıbı
        // hatırla Queue ıcın FIFO kullanıyor demıstık

    }
}
