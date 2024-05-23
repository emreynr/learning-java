import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        /*
        ConcurrentHashMap, is parcaciklari icin uygun bir classtir.
        birden fazla is parcaginina herhangi bir senkronizasyon sorunu olmadan
        ayni anda erisim saglayabilir.
        ayrintili kilitleme ozelligi sunar, bunun anlami mapte butun ogeler yerine
        sadece degisiklik yapilan kismini kilitler. boylece es zamanli islemler
        daha fazla olceklenebilir ve verimli hale gelir. kisacasi bir mimarinin
        kucuk bir kisminda degisiklik yapmak yerine degisiklik yapilan kismi kilitler.

         */

        // kisa bir kullanim ornegi
        // hashmap olusuturp degerler ekleme
        HashMap<String, Integer> map = new HashMap<>();
        map.put("david", 12); // haspmaler uzerinde put ile element eklenebilir
        map.put("sarah", 13);
        map.put("michael", 14);
        System.out.println("hasmap: " + map);

        System.out.println("hashmap element are: " + map.toString());
        map.computeIfAbsent("david", a -> 13 + 14);
        map.computeIfAbsent("sarah",  a -> 12 * 12);
        System.out.println("new hashmap after compute: "  + map);

    }
}