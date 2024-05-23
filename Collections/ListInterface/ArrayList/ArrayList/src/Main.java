import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // arraylist, list sinifindan extends eder


        int length = 12;
        //basit bit arraylist
        ArrayList<Integer> arraylist = new ArrayList<Integer>(4);
        // kapasiteyi primitive deger atayarakta yapabilir ya da arraylist
        // olusuturuken belirleyebiliriz. ozetle dinamik bir dizidir

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        // sonsuz degerli sekilde de olusturuabilir

        for (int i = 0; i < length; i++) {
            arraylist.add(i);
            list2.add(i);
        }
        System.out.println(" array1 :" + arraylist);
        System.out.println(" array2 : " + list2);

        // elemanlari siralama
        Collections.sort(arraylist);
        System.out.println(arraylist);

        // boyutu ogrenme
        System.out.println(arraylist.size()); // 12
    }
}
/*
arraylist sirali sekilde ekledigi icin ortadaki veya sondaki elemanlara erismek
daha yavastir.
arraylist icinde kopya elemanlara izin verilir

 */