import java.util.EnumMap;

public class Main {
    public static void main(String[] args) {

        Employee em1 = new Employee();
        Employee em2 = new Employee();
        Employee em3 = new Employee();

        em1.insert(12, "david", 2000);
        em2.insert(32, " micka", 3000);
        em3.insert(33, " kara", 4000);

        em1.showInformation();
        em2.showInformation();
        em3.showInformation();

    }
}