import java.util.Scanner;

public class array2d {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("row: ");
        int rows = scanner.nextInt();

        System.out.print("col: ");
        int cols = scanner.nextInt();

        int[][] array2d = new int[rows][cols];

        // matris icin ıstenen satır ve sutun sayısına uygun olarak sayı olusturacagız

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2d[i][j] = (i + 1) * ( j + 1);
            }
        }

        // daha sonra bu olusturuşan degerleri bastıracagız
        for ( int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(array2d[i][j] + " ");
                //
            }
            System.out.println(" ");
        }

        scanner.close();
        // ornek bir 5x5 matris olusturduk

    }
}
