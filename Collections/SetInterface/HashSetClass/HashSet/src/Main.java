import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        /*
        null ogelere izin verilir
        temeldeki veriyapisi HashTable dir
        HashSet'e eklenen nesneler icin ayni sirayla eklenecegi garantisi verilmez
        yani elementler karma kodlara gore eklenir
        HashSet klonlama ve serilestirma interface'lerine izin verir

         */

        //basit hashset ornekleri
        //hashset icin obje olusturma
        HashSet<ArrayList> hashSet = new HashSet<>();

        //arraylistler olusturma
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        //arraylistlere eleman ekleme
        arrayList1.add(12);
        arrayList1.add(21);
        arrayList2.add(32);
        arrayList2.add(76);

        // olusturdugumuz arraylistleri hashset icine ekliyoruz
        hashSet.add(arrayList1);
        hashSet.add(arrayList2);

        System.out.println("final HashSet is here: " + hashSet);
        System.out.println("HashSet size: " + hashSet.size());
    }
}