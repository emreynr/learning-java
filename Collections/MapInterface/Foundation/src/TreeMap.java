import java.util.HashMap;
import java.util.Map;

public class TreeMap {

    public static void main(String[] args) {

        /*

        key/value saklama icin en uygun olarak TreeMap uygun gorulmustur.
        burada keyler ya da tanimlandiklari sira ile ya da karisik bir sira ile depolanirlar.

         */

        //tanimlanmasi ve kullanilmasi
        Map<Integer, String> treeMap = new HashMap<Integer, String>();

        treeMap.put(12, "david");
        treeMap.put(1, "sarah");
        treeMap.put(3, " michael");
        treeMap.put(23, " subdavid");

        // iterator yontemi ile elementleri bastirma
        for (Map.Entry<Integer, String> keys : treeMap.entrySet()) {
            System.out.println("key : " + keys.getKey() + "  value: " + keys.getValue());
            // eklenme sirasina gore daha farkli bir siralamaya gore siraladi, heap deger yani tepedeki eleman 1 olur
            // hatirla tree mantiginda alfabetik ya da numerik olarak en onde olan deger tepedeki deger olurdu
        }


        // deger ekleme veya degistirme
        treeMap.replace(1,"sarah", "new sarah");
        System.out.println(treeMap);

        String deleted = treeMap.remove(12);
        System.out.println("removed element: " + deleted);


        System.out.println("updated treemap is here: ");
        for (Map.Entry<Integer, String> keys : treeMap.entrySet()) {
            System.out.println(keys);
        }
    }
}
