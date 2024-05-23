import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        /*
        linkedlistte oldugu gibi yalnizca unique degerler alabilir duplicate degerler kabul edilemez
        baslangicta kapasite null biraklabilir ya da deger verilebilir

         */

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // element ekleme
        linkedHashSet.add(12);
        linkedHashSet.add(32);
        linkedHashSet.add(1);
        linkedHashSet.add(53);

        linkedHashSet.add(12);
        linkedHashSet.add(32);

        System.out.println("linkedlist size: " + linkedHashSet.size());
        System.out.println("linkedlist elements: " + linkedHashSet);

        //eleman silme
        System.out.println(linkedHashSet.remove(12)); // true olarak doner cnku 12 setin icinde var

        // elemanin olup olmadigini kontrol etme
        System.out.println(linkedHashSet.contains(1)); // true doner cunku 1 icinde var

        // iterator yontemi ile element yazdirma
        Iterator iterator = linkedHashSet.iterator();
        for (Object o : linkedHashSet) {
            System.out.println("elements are: " + o);
        }
    }
}