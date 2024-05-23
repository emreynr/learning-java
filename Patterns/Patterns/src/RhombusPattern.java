import java.util.Scanner;

public class RhombusPattern {

    public static void rhombus(int rows) {

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            // ıc ıce for ıle starları bastırıyoruz
            for (int k = 1; k <= rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // rhombus pattern
        Scanner scanner = new Scanner(System.in);

        System.out.print("how many rows will be on pattern? : ");
        int rows = scanner.nextInt();

        rhombus(rows);


    }
}
