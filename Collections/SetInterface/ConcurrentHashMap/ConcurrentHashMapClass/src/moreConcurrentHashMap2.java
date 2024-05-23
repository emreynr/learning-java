import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class moreConcurrentHashMap2 {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

        // put ile element ekleme
        map.put("davıd", 1);
        map.put("sarah", 2);
        map.put("mıchael", 3);
        System.out.println("hashmap elements: " + map);

        // bır hashmapten baska bır hashmape element ekleme
        ConcurrentHashMap<String, Integer> map2 = new ConcurrentHashMap<String, Integer>();
        map2.putAll(map);
        System.out.println("new map2 hasmap: " + map2);

        // hashmap uzerınden element sılme
        int removedValue = map2.remove("david");
        System.out.println("removed element from map2: " + removedValue);

        // key value ıle elementlere erısme
        System.out.println("element: " + map2.get("david")); // david keye ait elemente erisme

        // iterator ve ekrana bastırma
        Iterator<ConcurrentHashMap.Entry<String, Integer> > iterator = map2.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();


        }


    }
}
