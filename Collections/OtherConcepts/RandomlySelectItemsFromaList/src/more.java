import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class more {

    // random element olusturacak metod
    public int getRandomElement(List<Integer> list, int size)  {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()) % size);
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(323000);
        list.add(3232);
        list.add(323);
        list.add(1);

        Main object = new Main();

        int indexOf = 3;

        System.out.println(object.getRandomElement(list, indexOf));

    }
}
