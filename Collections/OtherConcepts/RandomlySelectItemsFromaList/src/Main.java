import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    // metod ıle random elementı sececegız
    public int getRandomElement(List<Integer> list) {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args) {

        // array uzerınden random bır element/ler secme

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(32);
        list.add(11);
        list.add(55);
        list.add(111);

        Main object = new Main();

        System.out.println(object.getRandomElement(list));
    }
}