import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        /*
        duplicate elementlere izin verilmez
        element ekledikten sonra bastirilmak istenirse elementler
        eklenme suresine gore degil agac yapisina uygun olarak siralanir
        yani alfabetik olarak setin en basindaki element alfabeye gore
        siralanir.

         */

        SortedSet<String> sortedSet = new TreeSet<String>();

        // element ekleme
        sortedSet.add("david");
        sortedSet.add("sarah");
        sortedSet.add("michael");
        sortedSet.add("adam");

        System.out.println("tree's elements: " + sortedSet);

        // iterator yardimi ile bastirma
        Iterator<String> iterator = sortedSet.iterator();
        int loop = -1;
        for (Object o : sortedSet) {
            loop++;
            System.out.println(loop + ". elements are:" + o);
            //index icin arraya ceviripte alinabilirdi
        }
    }
}