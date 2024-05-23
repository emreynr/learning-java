import java.util.*;

public class yontem2 {

    public List<String> mapValueToList(Map<Integer, String> map) {

        //Collection kullanma
        Collection<String> value = map.values(); // keye karsılık gelen valueler String

        // ArrayList olusturma
        ArrayList<String> arrayList = new ArrayList<>(value);
        return arrayList;
    }

    public static void main(String[] args) {

        /*
        Map.values() metodu tarafından olusturulan bu map degerlerı collectıonunu ArrayList
        contructora ıleterek Map keylerını bır value Listesine donusturebılırız
        syntax
        Listofvalues = new ArrayList(map.values());
         */

        //HashMap olusturma
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(12, "david");
        hashMap.put(3, "sarah");
        hashMap.put(44, "michael");
        hashMap.put(1, "jack");
        // tabı bundan once Map uzerınde value degerlerı Liste donusuterecek metodu yazıyoruz

        Main object = new Main(hashMap);




    }
}
