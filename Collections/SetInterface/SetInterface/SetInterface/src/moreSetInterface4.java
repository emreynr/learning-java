import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class moreSetInterface4 {

    public static void main(String[] args) {

        //treeSet kullanimi

        Set<Integer> tree = new TreeSet<Integer>();

        tree.add(21);
        tree.add(12);
        tree.add(22);
        tree.add(1);
        tree.add(7);
        tree.add(32);

        System.out.println(" here is the treeSet: " +  tree);

        tree.remove(2);
        System.out.println(tree);

        Iterator it = tree.iterator(); // ekrana bastirmak icin

        for (Integer i : tree) {
            System.out.println(" elements: " + i);
        }
    }
}
