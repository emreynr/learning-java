import com.sun.source.doctree.ValueTree;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class moreBlockingQueue2 {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();

        queue.add(12);
        queue.add(22);
        queue.add(2);
        queue.add(55);
        queue.add(9);

        // baska bır queue ıcındekı tum elemanları baska bır queue ıcıne atma
        // once baska queue tanımlanmalı
        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();
        queue1.add(0);
        queue1.addAll(queue);
        System.out.println(queue1);

        // secılı elementın queue ıcınde olup olmadıgı ogrenme
        if (queue1.contains(9)) {
            System.out.println("elemen over here ");
        }
        else {
            System.out.println("this element doesnt exısts");
        }
        int top = queue1.element();
        System.out.println("here is the top:" + top); // ılk elemanı bulma

        // element sılme
        queue1.remove(12); // 12 elemanını sıler
        System.out.println(queue1);

        queue1.remove(); /// gerı kalan elemanlardan top elemeanı yanı ılk elemanı sıler
        System.out.println(queue1);

















    }
}
