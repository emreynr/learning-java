import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
// https://www.geeksforgeeks.org/linkedhashmap-class-in-java/
    public static void main(String[] args) {

        /*
        baslica ozellikleri
        LinkedHashMap keye dayali valueleri icerir.Map interface i uygular ve HashMap classini extend eder.
        sadece unique degerler olabilir
        bos bir key birden bos degere sahip olabilir
        senkronize degildir.
        ekleme sirasi olarak HashMap ile ayni ozelliklere sahiptir.
        HashMap classini extend eder
        bu class altindaki veriler node seklinde depolanir

        Senkronize HashMap
            LinkedHashMap uygulamasi senkronize degildir. birden fazla thread baglantili
            bir hash haritasine ayni anda erisiyorsa ve bu threadlerden en az biri map i yapisal
            olarak degistirirse, bunun harici olarak senkronize edilmesi gerekir. bu cogunlukla map i
            dogal olarak kapsayan bazi nesneler uzerinde senkronizasyon yapilarak gerceklestirilir.
            boyle bir nesne yoksa mapin Collections.syncronizedmap yontemi ile kapsanmasi gerekir.


         */

        // basit bir LinkedHashMap ornegi
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(2, "test1 protocol");
        linkedHashMap.put(3, " test2 protocol");
        linkedHashMap.put(4, " test4 protocol");
        linkedHashMap.put(5, " test32 protocol");

        System.out.println("linkedlistmap elements : " + linkedHashMap);
        System.out.println("4 e ait elementi alma : " + linkedHashMap.get(4));
        System.out.println("size of linkedlistmap :  " + linkedHashMap.size());
        System.out.println("is map empty? " + linkedHashMap.isEmpty()); // true veya false doner
        System.out.println("after removed an element : " + linkedHashMap.remove(2));

        // bastirma
        for (Map.Entry<Integer, String> objects : linkedHashMap.entrySet()) {
            System.out.println(" key : " + objects.getKey() + " value : " + objects.getValue());
        }
    }
}