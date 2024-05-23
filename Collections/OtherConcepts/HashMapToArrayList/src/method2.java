import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class method2 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(12, "david");
        map.put(2, "jack");
        map.put(1, "brick");

        // streamAPI olusturma ( key ıcın)
        ArrayList<Integer> listOfKeys = map.keySet().stream().collect(Collectors.toCollection(ArrayList::new));

        // keye karsılık gelen String value ıcın
        ArrayList<String> listOfValues = map.values().stream().collect(Collectors.toCollection(ArrayList::new));

        System.out.println("the keys of the map are : " + listOfKeys);
        System.out.println("the values of the map are :" + listOfValues);
    }
}
