import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class moreSetInterface {

    public static void main(String[] args) {

        Integer[] array1 = {1,2,312,32,22,111,555,333,23};
        Integer[] array2 = {23,543,66,22,87,99,97,65, 32};

        Set<Integer> set1 = new HashSet<Integer>(); // kapasitelik bir durum yok

        //array1 dizisini set1 hashstine ekleyecegiz,
        set1.addAll(Arrays.asList(array1));

        Set<Integer> set2 = new HashSet<Integer>();

        // array2 icindeki elemanlari set2 hashsetine atiyoruz
        set2.addAll(Arrays.asList(array2));  // asList yani olarak liste olarak eklemeyi belirtiyor


        // bu iki Set icindeki elementleri birlesim kumesini alir
        Set<Integer> unionBirlesim = new HashSet<Integer>(set1);
        unionBirlesim.addAll(set2);
        // iki set uzerindeki elemanlarin birlesimini alir

        System.out.println("union: " + unionBirlesim);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        // iki set icin kesisim elementlerini bulma
        Set<Integer> intersectionBirlesim = new HashSet<Integer>(set1);
        intersectionBirlesim.retainAll(set2);
        System.out.println("intersection: " + intersectionBirlesim);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        //fark kumesini bulma
        Set<Integer> differenceFarkumesi = new HashSet<Integer>(set1);
        differenceFarkumesi.removeAll(set2);
        System.out.println("difference elements: " + differenceFarkumesi);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        Set<Integer> set = new HashSet<Integer>();

        set.add(12);
        set.add(21);
        set.add(33);
        set.add(222);
        System.out.println("set : " + set);
        set.clear(); // tum elemanlari siler
        System.out.println("updated set : " + set);

        set.add(21);
        // contains ile secili elementin icinde olup olmadigi sorgulama
        System.out.println(set.contains(21)); // varsa true, yoksa false

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        // hashcode degeri

        Set<Integer>set3 = new HashSet<Integer>();
        set3.add(221);
        set3.add(33);
        set3.add(21);
        set3.add(444);
        System.out.println(set3);
        System.out.println(set3.hashCode()); // hashcode degerını bastırır

        // bos olup olmadıgını boolean ıle kontrol etme
        System.out.println("isEmpty? : " + set3.isEmpty());

        // ıterator ıle dongu kullanımı, ıterator olmadan setler ıcın verı bastırmanın baska yolu var mı bılmem
        Iterator forLoop = set3.iterator();
        System.out.println("here are Set's elements: ");
        while(forLoop.hasNext()) {
            System.out.println(forLoop.next());
        }

        // element sılme
        set3.remove(21); // element belırtılmelı. clear() butun elementlerı sılıyordu
        System.out.println(set3);

        // tum elementlerı sılme
        set3.removeAll(set3);
        System.out.println("new set3 ıs here: " + set3);

        // retainAll kullanımı, verılen ıkı set ıcındekı elementlerı karsılastırır ve aynı farklı
        // olanları sılıp aynı olanları korur
        Set<Integer> set4 = new HashSet<Integer>();
        set4.add(12);
        set4.add(132);
        set4.add(22);
        set4.add(333);

        Set<Integer> set5 = new HashSet<Integer>();
        set5.add(21);
        set5.add(132);
        set5.add(99);
        set5.add(3333);

        set5.retainAll(set5);
        System.out.println(set4); // aynı olanları korur, set4 u referans aldık

        // removeAll() kullanımı ( set to array yapyoruz.)
        Set<Integer> set6 = new HashSet<Integer>();
        set6.add(21);
        set6.add(1);
        set6.add(1221);
        set6.add(11);
        System.out.println("set6 elements: " + set6);

        Object[] arrayData = set6.toArray();
        for (int i = 0; i < arrayData.length; i++) {
            System.out.println(arrayData[i]);
        }


























    }
}
