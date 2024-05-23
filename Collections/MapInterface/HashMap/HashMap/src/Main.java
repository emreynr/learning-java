import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        /*
        hashtable benzer fakat yıne de senkronıze degıldır
        ek olarak null degerlere de ızın verır, null durumunda ıstısna dondurmez

         */

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(12, "david");
        hashMap.put(1, " test");
        hashMap.put(21, "sarah");
        hashMap.put(22, "mıchael");

        System.out.println("size of hashmap : " + hashMap.size());

        // herhangı bır elementın olup olmadıgını sorgulama
        if(hashMap.containsKey(1)) {
            String temp = hashMap.get(1);
            System.out.println("value of key : " + temp); // 1 keyıne aıt degerı bastırır
        }

        /*
        kısaca HashMap ozellıklerı
            erısım cok hızlıdır ve genellıkle O(1) zaman karmasıklıgı ıle erısım saglanır
            key/value degerlerını daıma saklar
            eklenme sıralarına gore depolanmazlar. LinkedHashMap ve
            HashMapın ekleme sırasını koruyan versıyonudur.
            Duplıcate valuelere ızın verır, yanı kopy degerler olabılır fakat duplıcate key olamaz.
            Threadler acısından guvenlı degıllerdır, bırden fazla threadın aynı HashMape aynı anda erısmesı
            durumunda verı tutarsızlıklarına yol acabılır.
         */






    }
}