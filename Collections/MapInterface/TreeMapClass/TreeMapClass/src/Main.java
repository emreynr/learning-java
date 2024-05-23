import java.util.Map;
import java.util.TreeMap;

public class Main {

    static public void  exampleConstructor () {
        // static yapılmazsa baska yerden cagırılamaz

        Map<Integer, String> treemap = new TreeMap<>();

        treemap.put(12, "david");
        treemap.put(21, "sarah");
        treemap.put(23, "mıchael test");

        System.out.println("here are the treemap elements : " + treemap);

    }


    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(23, "david"); // once ındex daha dogrusu referans degerı belırlenır, bu referans value cagırılır
        treeMap.put(12, "sarah");
        treeMap.put(2, "mıchael");

        // treemap uzerınden deger alma
        String gettingValue = treeMap.get(23); // 23 key degerıne karsılık gelen degerı alacak
        System.out.println("eleme ıs here : " + gettingValue);

        // treemap uzerınden element sılme
        treeMap.remove(23);
        System.out.println("updated treeMap ıs here : " + treeMap);

        // elementlerını ekrana bastırma
        for (Integer s : treeMap.keySet()) {
            System.out.println("key value : " + s + " and element : " + treeMap.get(s));
        }

        /*
        Map ınterface ını uygular
        bos key degerı verılemez yanı mutlaka bır deger gırılmelı, gırılmez ıse null ıstısnası olusturur

         */

        //constructor kullanarak treemapı kullanma
        // once ayrı bır metod yazılmalı
        exampleConstructor();






    }
}