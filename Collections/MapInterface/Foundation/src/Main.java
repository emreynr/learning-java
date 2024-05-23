import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /*
        Map uzerindeki hatalarda ciktilar aciklamalari ile birlikte olur.
        Map icin sunu soyleyebiliriz, bir key ve onunla iliskilendirilmis bir deger olur.
        ornegin ogrenci adi ve ogrenci id adi seklinde depolanabilir, burada ogrenci id key,
        digeri ise bu key ile iliskilendirilmis deger olur.

        - her bir key degeri yalnizca sadece bir deger ile eslesebilir, yani duplicate degerler olamaz
        - map icin tam olarak bir siralamadan bahsedilemez. mesela TreeMap ve LinkedHashMap icin siralamadan
        bahsedilebilir fakat HashMap icin boyle birseyden soz edilemez.
        - Mapin implemente edilebilecegi iki farkli interface vardir, bunlar Map ve SortedMap ve uc classtir,
        HashMap, TreeMap, LinkedHashMap.

         */

        // basit bir Map implemente edip kullanma
        Map<Integer, String> map = new HashMap();

        // put metodu ile eleman ekleme
        map.put(12, "davod");
        map.put(23, "test");
        map.put(22, "sarah");

        for(Map.Entry<Integer, String> keys : map.entrySet()) {
            System.out.println(" index here:  " + keys.getKey() + " elements are here: " + keys.getValue());
        }
    }
}