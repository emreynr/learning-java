import java.util.HashMap;
import java.util.Map;
// https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
public class moreHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap1 = new HashMap<>();

        hashMap1.put(12, " david");
        hashMap1.put(21, " sarah");
        hashMap1.put(22, " michael");

        HashMap<Integer, String> hashMap2 = new HashMap<>();

        hashMap2.put(2, "david1");
        hashMap2.put(3, "michael1");
        hashMap2.put(4, " jack");

        System.out.println(" Hashmap1 elements are here : " + hashMap1);
        System.out.println("hashmap2 elements are hre" + hashMap2);

        // element degistirme
        hashMap1.put(12, " new david");
        System.out.println(" updated hashmap1 elements : " + hashMap1);

        // element silme
        hashMap1.remove(12);
        System.out.println("after removed element hashmap1 : " + hashMap1);

        // for each
        for (Map.Entry<Integer, String> elements : hashMap2.entrySet()) {
            System.out.println("key : " + elements.getKey() + " value : " + elements.getValue());

            /*

            HashMap ile ilgili onemli ozellikler
                - hashmap olusturuldugu andaki kapastiesi 2 uzeri 4 kadardir
                - Load Factor yani belirli bir kapasiteye geldigi zaman yeniden karma yapacagi yeri belirtir
                  default olarak 75% tir
                - Theresold yani esik degeri, kapasite ile Load factorun carpimidir. esik bu carpim degerini
                  gecerse rehasing gerceklesir
                - rehashing; hashmapin esigine ulastiktan sonra kapasitesini iki katina cikarma islemidir.

                baslangic kapasitesi daha yuksek tutulursa asla karma islemi yapilmayacaktir fakat bu seferde
                zaman karmasikligi artacaktir.
             */
        }
    }
}
