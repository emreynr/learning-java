import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {

    public static void main(String[] args) {

        /*
        ekleme sirasi bakimindan HashMap ile benzer saklama yontemine sahiptir.

         */

        /// linkedhashmap kullanimi

        Map<Integer, String> linkedhashmap = new HashMap<>();

        linkedhashmap.put(12, "david");
        linkedhashmap.put(1, "davids");
        linkedhashmap.put(2, " sarah");

        for (Map.Entry<Integer, String> keys : linkedhashmap.entrySet()) {
            System.out.println(" key : " + keys.getKey() +  "   value : " + keys.getValue());
        }
    }
}

