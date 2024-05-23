import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        toArray() yontemı ıle Arraya cevırecegız
        bunun ıcın 3 farklı yontem var
        1 - Object[]toArray()
        2 - T[]toArray(T[]a)
        3 - get() method
         */

        // ılk yontem ıle ArrayList to Array

        List<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(32);
        arrayList.add(322);
        arrayList.add(1);
        arrayList.add(34);

        Object[] objects = arrayList.toArray();

        // son olarak array elemanlarını bastırma
        for (Object object : objects) {
            System.out.println(" objects : " + object);
        }
    }
}