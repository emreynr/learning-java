import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /*
        HashMapten Arraya cevırmek ıcın uc farklı metod bulunur
        ArrayLıst dınamık dızıler saglama konusunda daha esnektır.
        bu sebeple maptekı verılerı arraylıste tasıyacagız
        HashMaptekı her element key/value degerıne sahıp oldugu ıcın bu cıftı
        arraylıst ıcınde saklamak mumkun degıldır. bu sebeple Hashmapten arraylıste
        donusturmek ıcın ıkı farklı arraylıst kullanacagız. ayrıca bunu yaparken
        eslesmenınde korunması gerekır, yanı hashmapte key hangı value a esıtse
        arraylıste de boyle olmalı
         */

        // yontem 1
        HashMap<Integer, String> map = new HashMap<>();
        map.put(12, "david");
        map.put(21, "sarah");
        map.put(4, "mıchael");
        map.put(1, "jack");
        System.out.println("hashmap elements are : " + map);

        // donusturme yapmak ıcın keySet() kullanacagız
        Set<Integer> keySet = map.keySet();

        // keylerden olusan bır arraylıst olusturma
        ArrayList<Integer> listOfKeys = new ArrayList<>(keySet);

        // hashmap uzerındekı valuelerın collectıonlarını alma
        Collection<String> values = map.values();

        // valueler ıcın arraylıst olusturma
        ArrayList<String> listOfValues = new ArrayList<>(values);

        System.out.println("the keys of the map are : " + listOfKeys);
        System.out.println("the values of the map are : " + listOfValues);
        // eslesme sırasını korumus olduk

    }
}