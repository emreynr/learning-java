import java.util.TreeMap;

public class Main {


    static public void exampleConstructor2 () {

        // bos bır treemap olusturma
        TreeMap<Student, Integer> treeMap = new TreeMap<Student, Integer>(new SortClass());

        treeMap.put(new Student(190, "david", "US"), 2);
        treeMap.put(new Student(222, "mıchael", "UK"), 3);
        treeMap.put(new Student(323, "sarah", "CA"), 1);

        System.out.println("TreeMap elements : " + treeMap);
    }

    public static void main(String[] args) {

        System.out.println("comparator and constructor using with TreeMap");
        exampleConstructor2();
    }
}