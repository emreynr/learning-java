import java.util.ArrayList;
import java.util.List;

public class yontem3 {

    public static void main(String[] args) {

        /*
        get() ıle manuel sekılde donusturme yapma
         */

        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(43);
        arrayList.add(3);

        // boyut olarak arraylist ile aynı boyutta olan bır array olusturduk
        Integer[] array = new Integer[arrayList.size()];

        // donusturme
        for (int i = 0; i < arrayList.toArray().length; i++) {
            array[i] = arrayList.get(i);
            // elemanları ekleme bıttı
        }

        for (Integer i : array) {
            System.out.println("array elements are here : " + i);
        }
    }
}
