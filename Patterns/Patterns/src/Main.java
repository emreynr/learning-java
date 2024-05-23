import java.util.Scanner;

public class Main {

    public static void leftPyramid (int rows) {

        for (int i = 1; i <= rows; i ++) {
            // System.out.print(" ");

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // left based pyramid
        System.out.print(" how many rows wıll be on pyramıd? : ");
        int rows = scanner.nextInt();

        leftPyramid(rows);
    }
}