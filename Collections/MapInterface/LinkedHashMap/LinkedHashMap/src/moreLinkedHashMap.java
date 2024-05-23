import java.util.LinkedHashMap;
import java.util.Set;

public class moreLinkedHashMap {

    public static void main(String... args) {

        /*
        bircok yonden LinkedHashMap ile HashMap cok benzerdir fakat LinkedHashMap, HashMapi gelistirmek icin
        hem HashMap LinkedListi temel alir.
         */

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(12, null);
        linkedHashMap.put(21, null);
        linkedHashMap.put(32, null);
        linkedHashMap.put(3,  null);

        Set<Integer> keys = linkedHashMap.keySet(); // linkedHashMapin keyleri icin bir dizi olusturuyoruz
        Integer[] array = keys.toArray(new Integer[0]);

        for (int i = 0; i < array.length; i++) {
            assertNull(new Integer(i + 1), array[1]);
        }
    }
}
