import java.util.AbstractSet;
import java.util.TreeSet;

public class moreAbstractClass2 {

    public static void main(String[] args) throws Exception {

        try {

            AbstractSet<Integer> as = new TreeSet<Integer>();

            as.add(121);
            as.add(2);
            as.add(21);
            as.add(32);
            System.out.println("set: " + as);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
