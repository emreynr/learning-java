import java.util.Scanner;

public class reversePyramid {

    public static void reversePyramid(int rows) {

        for (int i = rows; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many rows will be on pattern? : ");
        int rows = scanner.nextInt();

        reversePyramid(rows);
    }
}
