import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //bir List classından olan ArrayListin kullanımı
        List<Integer> arrayList = new ArrayList<Integer>();

        // eleman ekleme
        arrayList.add(0,99); // bu sekılde de ekleyebılırız, fakat gerek yok ArrayList elemanları zaten sıralı sekılde ekler
        arrayList.add(23);

        System.out.println(arrayList);

        List<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(22); // 0. index
        arrayList2.add(54); // 1 index
        arrayList2.add(2, 11); // 2. index

        System.out.println(arrayList2);

        arrayList2.remove(2); // 2. indexi siler
        System.out.println(arrayList2);

        System.out.println("-----------------------------------");

        arrayList2.addAll(1, arrayList);
        // arraylist2 birinci indexe arraylistin birinci indexteki elemanini ekler
        // gordugun gibi elemen ekledikce dizi saga dogru kayiyor
        System.out.println(arrayList2);

        System.out.println(arrayList2.get(2));
        // arraylist2 deki ikinci indexti elemani alir

        System.out.println("---------------------------");
        arrayList2.set(3, 111);
        // ucuncu indexe 111 i ekler









    }
}