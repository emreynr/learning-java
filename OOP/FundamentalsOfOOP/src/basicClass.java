import java.util.Scanner;


public class basicClass {


    public static int sum(int first, int last) {
        Scanner scanner = new Scanner(System.in);
        int summing = first + last;
        return summing;
    }
    public static void main(String[] args) {

        System.out.println(sum(12,33));
        // cok basit kullanimi
    }
}
