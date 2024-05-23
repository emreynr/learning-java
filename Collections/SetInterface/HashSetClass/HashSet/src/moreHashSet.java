import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class moreHashSet {

    static public boolean checking() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("element added");

        assert(hashSet.contains("element added"));

        return true;
    }

    static void loop () {
        Set<String> hash = new HashSet<String>();
        hash.add("david");
        hash.add("sarah");
        hash.add("michael");

        Iterator iterator = hash.iterator();

        for (Object o : hash) {
            System.out.println("elements are: " + o);
        }
    }

    public static void main(String[] args) {
        System.out.println(checking());
        // yukarida check icin element icindeki oldugu icin true doner

        //hashset icindeki elemanlari bastirma
        loop();
    }
}
