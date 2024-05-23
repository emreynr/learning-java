import java.util.AbstractSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // try catch sart degil fakat olasi istisnalar icin kullanacagiz


        try {

            // Integer bos bir TreeSet olusturuyoruz
            // AbstractSet icin obje olusturuyoruz
            AbstractSet<Integer> as = new TreeSet<Integer>();

            as.add(21);
            as.add(2);
            as.add(222);
            as.add(4);
            as.add(43);
            System.out.println(" elements: " + as);

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}