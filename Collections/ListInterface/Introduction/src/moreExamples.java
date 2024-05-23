import java.util.ArrayList;
import java.util.List;

public class moreExamples {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<String>();

        arrayList.add("david");
        arrayList.add("michael");
        arrayList.add("testing");
        System.out.println(arrayList);

        // ikinci indexteki veriyi guncelleyelim
        arrayList.set(2, " sarah");
        System.out.println("updated list: " + arrayList);

        System.out.println("++++++++++++++++++++++++++++++++++");

        List<Integer> numberList= new ArrayList<Integer>();
        numberList.add(2); // 0. index, arraylist sirali sekilde ekler
        numberList.add(44);
        numberList.add(22);
        numberList.add(32);
        numberList.add(1232);
        numberList.add(2);

        int index = numberList.indexOf(2);
        System.out.println(index);

        int lastIndex = numberList.lastIndexOf(2);
        System.out.println(lastIndex);
        // 2 degerinin hem 0. indexte hem de 5. indexte oldugunu belirtir

        for (Integer i : numberList) {
            System.out.println(" number is here: " + i);
        }

        System.out.println("+++++++++++++++++++++++++++++++++");
        // booelan ile secili elemanin olup olmadigini bulma

        List<String> findIt = new ArrayList<String>();
        findIt.add("david");
        findIt.add("terst");
        findIt.add("bro");

        boolean isPresent = findIt.contains("david");
        // contains ile icinde olup olmadigini booelan ile kontrol eder

        System.out.println(" value is exist?: " + isPresent);



    }
}
