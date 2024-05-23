import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {

        /*
        HashMap ıle ıslemler senkronıze edılmezken HashTable senkronızasyon saglar. Hashtable threadler acısından guvenlı
        olmasına ragmen cokta verımlı degıldır, bu sorunu cozmek ıcın javada ConcurrentMap gelıstırılmıstır.

        ConcurrentMap senkronıze map olarak gelıstırılmıstır.
        threadler ıcın guvenlı bır ınteface oldugu ıcın tum ıslemler aynı anda gerceklestırılebılır.


         */

        // ornek kullanım ve bırkac metod ıle uygulanısı
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<Integer, String>();

        concurrentHashMap.put(12, "david");
        concurrentHashMap.put(13, "sarah");
        concurrentHashMap.put(14, " mıchael");
        concurrentHashMap.put(1, " kara");



        concurrentHashMap.putIfAbsent(12, "david"); // true veya false dondurur
        concurrentHashMap.remove(12, "david");
        concurrentHashMap.putIfAbsent(12, "david"); // faşse dondurur

        concurrentHashMap.replace(13, "sarah", "newsarah");
        System.out.println("elements are : " + concurrentHashMap);






    }
}