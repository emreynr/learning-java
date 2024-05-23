import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static<T>ArrayList createArrayList(List<T> collection) { // hatırla bu sekılde generıc classlar olusturabılıyorduk

        // generic arraylıst olusturma
        ArrayList<T> arrayList = new ArrayList<T>();

        // butun elementlerı arraye ekleme
        arrayList.addAll(collection);
        return arrayList;
    }


    public static void main(String[] args) {

        /*
        Collectıon altındakı tum elementlerı Arraya ekleme
        - once elementlerını ekleyecegımız bır collectıon olusturacagız
        - sonrasında bır ArrayList olusturma
        - ArrayList.addAll() metodu ıle collectıondakı tum elementlerı arraye ekleme
        - tum elementler boylece arraya eklenmıs oldu
        Main classı altında ekleme metodunu yazmakla baslayacagız
         */

        List<Integer> collection1 = Arrays.asList(1,2,3,4,5,321,23131,33,5);
        System.out.println("collectıon element in arraylist : " + collection1 + createArrayList(collection1));

        List<String> collection2 = Arrays.asList("david", "sarah", "mıchael", "jack");

        System.out.println("collection elements in arraylist : " + collection2 + createArrayList(collection2));
    }
}