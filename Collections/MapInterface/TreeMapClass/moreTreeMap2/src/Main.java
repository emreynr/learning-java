import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(12, "david");
        treeMap.put(1, "sarah");
        treeMap.put(2, " michael");
        treeMap.put(3, "kara");

        for (Map.Entry a : treeMap.entrySet()) {
            System.out.println(" key : " + a.getKey() + " value : " + a.getValue());
        }

        System.out.println("descending : " + treeMap.descendingMap());
        System.out.println("belirtilen degere esıt veya buyuk olanları dondurur : " + treeMap.tailMap(2)); // 2 den itibaren baslayacak
        System.out.println("belırlı ıkı key arasındakı degerlerı dondurur : " + treeMap.subMap(2,12));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // buradan sonrası basit bır kitap uygulamasına ait
        // once farklı bır sınıfta degerlerı alacagımız ve ozellıkler ıcın degerler olustuyoruz

        Map<Integer, String> book = new TreeMap<>();


        // Book classına ait birkac referans objesı olusturuyoruz
        Book b1 = new Book(1, 300, "test1", "testAuthor1", "testPublisher1");
        Book b2 = new Book(2, 400, "test2", "testAuthor2", "testPublisher2");
        Book b3 = new Book(3, 150, "test3", "testAuthor3", "testPublisher3");

        // Map ıcıne element ekleme
        treeMap.put(12, "david");
        treeMap.put(32, "sarah");
        treeMap.put(11, "michael");

        // elementlerı bastırma
        for (Map.Entry e : treeMap.entrySet()) {
            System.out.println("key : " + e.getKey() + " value : " + e.getValue());
            
        }


    }
}