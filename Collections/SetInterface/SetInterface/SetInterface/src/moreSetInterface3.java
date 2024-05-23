import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class moreSetInterface3 {

    public static void main(String[] args) {

        // linkedhashset kullanimi

        Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();

        linkedHashSet.add(2);
        linkedHashSet.add(32);
        linkedHashSet.add(2132);
        linkedHashSet.add(3);

        // ayni elemandan ekleme
        linkedHashSet.add(2);

        // element silme
        linkedHashSet.remove(32);
        System.out.println(" set after removing element: " + linkedHashSet);

        // iterator ile elemanlari bastirma
        Iterator loop = linkedHashSet.iterator();

        for(Integer i : linkedHashSet) {
            System.out.print(i + " ");
        }
    }
}
