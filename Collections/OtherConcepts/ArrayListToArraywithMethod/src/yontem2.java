import java.util.ArrayList;
import java.util.List;

public class yontem2 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(32);
        arrayList.add(1);
        arrayList.add(323);
        arrayList.add(4);

        Integer[] array = new Integer[arrayList.size()];
        array = arrayList.toArray(array);

        for (Integer i : array) {
            System.out.println("array elements are here : " + i);
        }
    }
}
