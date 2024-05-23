import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {

    public static void main(String[] args) {

        int[] array = new int[10];
        // 10 eleman alacak sekılde bır array tanımladık

        array[0] = 12;
        // ayrıca arraylere ıstedıgımız yerden element ekleyemeyız, mutlaka sıralı sekılde eklenmelı
        array[1] = 213;

        System.out.println(array[1]);

        // kapasıte belırterek ArrayList olusturalım
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(34);
        arrayList.add(43);

        System.out.println(arrayList.get(2)); // ıkıncı ındextekı elemanı alır

        System.out.println(Arrays.toString(array));
        // basta 10 elemanlık yer actıgımız ıcın dıger ındexlerıdekı degerler 0 olarak gozukuyor


        /*
        ıkısı arasındakı onemlı farklılıklar
        ArrayList ıcın konusursak nesneler hıcbır zaman bıtısık konumlarda saklanmazlar.

        - Array cok boyutlu olabılır fakat ArrayList cok boyutlu olamaz
        - Array sabıt boyutludur, ArrayList dınamık boyutu vardır
        - hız bakımından ArrayList dınamık oldugu ıcın daha yavastır.
        
         */


    }
}
