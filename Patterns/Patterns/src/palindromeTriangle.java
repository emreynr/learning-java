import java.util.Scanner;

public class palindromeTriangle {

    public static void palindromeTriangle(int rows) {

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // palındrome sayılardan olusan bır ucgen

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many rows will be on pattern? : ");
        int rows = scanner.nextInt();

        palindromeTriangle(rows);
    }
}
