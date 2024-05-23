import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        /* Map aksine SortedMapte veriler bir siraya gore saklanirlar

         */

        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        sortedMap.put(1, "david");
        sortedMap.put(3, "sarah");
        sortedMap.put(12, "michael");
        sortedMap.put(22, "david bro");

        // key degeri ile bir value i alma
        String temp = sortedMap.get(12);
        System.out.println(" key 12 equal to  : " + temp);

        // element silme
        String temp1 = sortedMap.get(22);
        System.out.println(" deleted value : " + temp1);

        // map icindeki degerleri bastirma
        for (Object s : sortedMap.entrySet()) {
            System.out.println(s);
        }

        /*
        sortedmapte verıler belırlı bır sıraya gore depolanırlar. map ıcındekı verılerı yıne belırlı bır sıraya gore almak
        gerektıgınde sortedmap cok kullanıslı olabılır.
        logn zaman karmasıklıgı ıle calısır ve sortedmap uzerınde arama yapmak dıger maplere gore cok daha hızlıdır.

        bır oge eklemek sortedmap ıcın daha zahmetlı bır ıslemdır, cunku verıler belırlı bır sıraya gore depolandıkları ıcın
        map e gore verı ekleme daha zahmetlı olabılır.

         */
}