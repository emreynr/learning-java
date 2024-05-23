import java.util.*;

public class moreAbstractClass {

    public static void main(String[] args) throws Exception{

        try {

            AbstractSet<Integer> as = new TreeSet<>();
            as.add(21);
            as.add(2);
            as.add(3);
            as.add(6);
            as.add(76);
            System.out.println("TreeSet before removeAll() : " + as);

            // creating an arraylist integer type
            Collection<Integer> arrayList = new ArrayList<Integer>();
            arrayList.add(21);
            arrayList.add(2);
            arrayList.add(6);
            arrayList.add(76);

            as.removeAll(arrayList);
            System.out.println("abstractSet after removing operation: " + as);

        }
        catch (NullPointerException e) {
            System.out.println("exception: " + e);
        }
    }
}
