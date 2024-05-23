import java.util.*;

public class finalExample {

    public static void main(String[] args) {

        //bir arrayda herhangi bir elemanin kac kere tekrar ettigini bulma

        int values[] = {1, 2, 3, 42, 1, 3, 5, 6, 87, 99, 23, 12, 43, 1, 2, 3, 4, 5, 69};

        // bu elementleri bir arraylist icine ekleme
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < values.length; i++) {
            arrayList.add(values[i]);  // i nci elemani arraylisti icine ekler
        }

        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arrayList.size(); i++) {
            hashmap.putIfAbsent(arrayList.get(i), Collections.frequency(arrayList, arrayList.get(i)));
        }

        for (int i = 0; i < values.length; i++) {
            int temp = arrayList.get(i);
            hashmap.put(i , temp );
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" here are hashmap elements : " );
        for (Map.Entry<Integer, Integer> keys : hashmap.entrySet()) {
            System.out.println(" element : " + keys);
        }
    }
}