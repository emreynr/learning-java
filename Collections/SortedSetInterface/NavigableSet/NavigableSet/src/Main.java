import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        /*
        (NavigableSet bir interface classidir)
        NavigableSet interface, SortedSete tanimlanan siraya kiyasla sette
        ters sirada gezinebilir. bir navigableset artan veya azalan sirada
        erisilebilir ve icide gezinilebilir. bu interface i uygulayan
        classlar ise: TreeSet ve ConcurrentSkipListSet

         */

        NavigableSet<Integer> navigableSet = new TreeSet<>();

        navigableSet.add(32);
        navigableSet.add(12);
        navigableSet.add(1);
        navigableSet.add(23);
        navigableSet.add(213);
        System.out.println("elements are: " + navigableSet);

        // elementleri tersten siralama(descending = yuksekten dusuge)
        NavigableSet<Integer> reverse = navigableSet.descendingSet();

        System.out.println("normal set: " + navigableSet);
        System.out.println("reversed set: " + reverse);

        System.out.println("first element from normal set: " + navigableSet.first());
        System.out.println("last element from normal set: " + navigableSet.last());


        // yineleme
        int loop = 0;
        for (Integer i : navigableSet) {
            System.out.println(loop++ + ". element of normal set : " + i);
        }

    }
}