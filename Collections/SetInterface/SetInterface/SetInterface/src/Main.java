import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        /*
        NavigableSet ve SortedSet ikisi de interface'dir
        NavigableSet SortedSeti extend eder, boylece ekleme sirasi korunmaz ve
        veriler sirali bir sekiled saklanmaz


         */

        // basit LinkedHashSet ornegi

        Set<Integer> set = new HashSet<Integer>();
        // LinkedHashSet classindan referans olusturdugumuzda veriler nasil girdiysek o sira ile yani karisik
        // HashSet classindan referans olusturdugumuzda hashset yapisina gore siraliyor
        set.add(21);
        set.add(22);
        set.add(1);
        set.add(12);

        System.out.println(set);


    }
}