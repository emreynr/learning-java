import java.util.Arrays;
import java.util.LinkedList;

public class moreLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(12);
        linkedList.add( 33);
        linkedList.add(32);

        System.out.println(linkedList.indexOf(32));
        System.out.println(linkedList.indexOf(33));

        linkedList.add(1,99);
        System.out.println(linkedList);

        linkedList.set(1, 98); // 1. ındextekı elemanın yenı degerını 98 yapar

        linkedList.remove(2); // 2. indextekı elemanı sıler

        System.out.println("*******************************");
        // for ıle
        for(Integer i : linkedList) {
            System.out.println(i);
        }

        System.out.println("*******************************");
        // toArray() metodu ıle lınkedlıstı array e cevırme
        // arraylıst ıle elemanlar sıralı sekılde eklenıyordu

        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        linkedList1.add(12);
        linkedList1.add(32);
        linkedList1.add(22);
        linkedList1.add(1);
        System.out.println("lınkedlıst ıs here:" + linkedList1);
        Object[] to = linkedList1.toArray(); // arraya cevırme
        System.out.println("after converted lınkedlsıt to array: ");

        for (Object o : to) {
            System.out.print(o + " ");
            // bu sekılde normal bır arraya cevırmıs olduk
        }
        System.out.println("\n");

        System.out.println(linkedList1.size());
    }
}
