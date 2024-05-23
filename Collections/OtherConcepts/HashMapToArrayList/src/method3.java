import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class method3 {

    public static void main(String[] args) {

        /*
        aslında oncekı ıkı yontemde hashmaptekı sıranın korunmadıgını gorebılırız
        her ne kadar sıralı sekılde gosterse de aslında ıkı farklı array ve bırı
        key dıgerı de valuelerı tutuyor.
        bu yontemde HashMap deger cıflterını entrySet() kullanarak tutabılırız.
        bu yontem hashmapte bulunan aynı ogelerden belırlı bır gorunumu dondurur ve
        yenı bır kume olusturabılır ve bunun ıcıne kaydedebılır.
         */

        HashMap<Integer, String> map = new HashMap<>();

        map.put(12, "david");
        map.put(2, "jack");
        map.put(1, "brick");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        ArrayList<Map.Entry<Integer, String>> listOfEntry
                = new ArrayList<Map.Entry<Integer, String>>(entrySet);

        System.out.println(listOfEntry);

    }
}
