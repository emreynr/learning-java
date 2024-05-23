import java.util.concurrent.ConcurrentHashMap;

public class moreConcurrentHashMap {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        System.out.println("map size: " + map.size());
        System.out.println("map here: " + map);

        // map uzerinden elementleri alma
        int element1 = map.get("A");
        System.out.println("A elementine ait deger: " + element1);

        int element2 = map.get("D");
        System.out.println("D elementine ait deger: " + element2);

        // element silme
        map.remove("C");

        System.out.println("map size : " + map.size());
        System.out.println(" updated map : " + map);

        //ConcurrentHaspMap ayni anda is parcaciklari tarafindan 16 is yapilabilir
    }
}
