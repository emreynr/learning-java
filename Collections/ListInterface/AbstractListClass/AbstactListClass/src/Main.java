import java.util.AbstractList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // sematik proje dizini altinda var
        // AbstarctList soyut bir sinif oldugu icin ArrayList LinkedList
        // veya Vector gibi alt siniflarinin bir ornegine atanmalidir

        List<Integer> list = new MyList(13);
        // List inteface classindan yeni bir list olusturup size 13 yaiyoruz

        for (Integer i : list) {
            System.out.println(i);
        }














    }
}