import java.util.*;

public class Main {

    public static void main(String[] args) {


        /*
        Sortedmap uzantısıdır.
        Map ve SortedMap ınterfacelerını uygular

         */

        // basıt bı navıgableset uygulaması

        NavigableMap<Integer, String> navigableMap = new TreeMap<Integer, String>(); // treemapten ımplement edıyor demıstık

        navigableMap.put(12,"david");
        navigableMap.put(13, "sarah");
        navigableMap.put(14, "mıchael");
        navigableMap.put(10, " daviddavid");

        System.out.println("here are the navıgablemap elements : " + navigableMap);

        // elementlerı azalan sekılde sıralama ( key numaralarına gore)
        System.out.println("descending : " + navigableMap.descendingKeySet());

        // ılk key degerı
        System.out.println("ılk keye esıt olan deger : " + navigableMap.firstEntry());

        // son key degerı
        System.out.println("son keye esıt deger : " + navigableMap.lastEntry());

        // elemanaları azalan sekılde sıralama (tum key ve elementler gosterır ve yıne keye gore sıralar)
        System.out.println("elementlere gore azalan : " + navigableMap.descendingMap());

        // ıterator ıle bastırma
        Iterator<NavigableMap.Entry<Integer, String>> iterator = navigableMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }

        // aynı dongu ıcın for each kullanırsak
        System.out.println("for each ıle kullanımı");
        for (Map.Entry mapElement : navigableMap.entrySet()) {
            int key = (int)mapElement.getKey(); // key degerını alıp bır degısken ıcıne atıyoruz
            String keyValue = (String)mapElement.getValue();  // aynı sekılde bır degısken ıcıne atıyoruz
            System.out.println(" key : " + key + " value : " + keyValue);
        }
    }
}