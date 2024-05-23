import java.util.Scanner;

public class midBasedPyramid {

    public static void midPyramid(int rows) {

        for(int i = 0; i <= rows; i++) {

            for (int j = 0; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many rows wıll be ın pattern? : ");
        int rows = scanner.nextInt();

        midPyramid(rows);
    }
}
