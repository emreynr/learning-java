import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class moreDeque {

    public static void main(String[] args) {

        // ArrayDeque classı altında yazdıgım default sıralamayı burada
        // gorecegız ve karsılastıracagız


        Stack<Integer> stack = new Stack<Integer>();
        Deque<Integer> deque = new ArrayDeque<Integer>();

        stack.push(2);
        stack.push(4);
        stack.push(5);

        deque.push(2);
        deque.push(3);
        deque.push(5);

        for ( int i = 0; i < stack.size(); i++) {
            System.out.println("here: " + stack.get(i));
        }

        System.out.println("************************************");

        for (Integer i : deque) {
            System.out.println("here: " + i);
        }

        /*
        stackte goruldugu gıbı kendı sıralama yapmıyor
        fakat deque kendı yapıyor, basıt bır for test etmıs olduk



         */
    }
}
