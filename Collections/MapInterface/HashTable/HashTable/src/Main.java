import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /*
        java collectıonstan once de var oldugu ıcın Mapi ımplement etmıyor.
        HashTable senkronize edilir fakat Map ınterface nın dıger arayuzlerı ıle
        karsılastırıldıgında daha yava performansa sebep olabılır. fazla eskı bır
        class oldugu ıcın bunun yerine Map ınterface ya da onu ımplement edenlerden
        bırını(HashMap veya ConcurrentHashMap) kullanmak onerılır
         */

        // ornek HashTable kullanımı
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(12, "david");
        hashtable.put(2, "sarah");
        hashtable.put(4, "mıchael");
        hashtable.put(1, "jack");

        // belırlı bır keydekı degerı olmak
        System.out.println("value of key 12 : " + hashtable.get(12));

        hashtable.remove(12);
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println("key : " + key + "value : " + hashtable.get(key));
        }

        /*
        HashMape benzer fakat senkroonıze edılmıs halıdır.
        HashTable de key/value olarak verı saklar
        HashMap herhangı bır numaralardırma saglamazken, HashTable hızlı olmayan
        numaralandırma saglar

         */
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        for (Map.Entry<Integer, String> k : hashtable.entrySet()) {
            System.out.println("key : " + k.getKey() + "value : " + k.getValue());
        }
    }
}