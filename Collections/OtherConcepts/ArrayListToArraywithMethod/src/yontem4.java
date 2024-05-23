import java.util.ArrayList;
import java.util.List;

public class yontem4 {

    public static void main(String[] args) {

        /*
        java8 den ıtıbaren var olan Flow API lerı kullanarak donusturme
         */

        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(21);
        arrayList.add(2);
        arrayList.add(12);
        arrayList.add(23232);

        // donusturme
        int[] array = arrayList.stream().mapToInt(i -> i).toArray();

        for (int x : array) {
            System.out.println("array elements are here : " + x);
        }
    }
}
