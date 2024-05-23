import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class moreCopyOnWriteArraySet {

    public static void main(String[] args) {

        // ıtreator kullanarak yapacagız
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();

        // element ekleme
        copyOnWriteArraySet.add("test");
        copyOnWriteArraySet.add("david");
        copyOnWriteArraySet.add("sarah");
        System.out.println("all elements of arrayset: " + copyOnWriteArraySet);

        Iterator forLoop = copyOnWriteArraySet.iterator();

        for(Object i : copyOnWriteArraySet) {
            System.out.println(i);
        }
    }
}
