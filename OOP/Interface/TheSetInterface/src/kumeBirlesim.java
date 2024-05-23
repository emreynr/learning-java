import java.util.HashSet;
import java.util.Set;

public class kumeBirlesim {

    public static void main(String[] args) {

        System.out.println("****************************************");
        System.out.println("kume birlesim islemi");
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        Set<String> symetricDiff = new HashSet<>(s1); // fark kumesini s1 olarak belirledik
        symetricDiff.addAll(s2);

        Set<String> temp = new HashSet<String>(s1);
        temp.retainAll(s2);
        symetricDiff.removeAll(temp);

        for (String k : args) {
            if (!s1.add(k)) {
                s2.add(k);
            }
        }
        System.out.println("kume birlesimi: " + s1);
    }
}
