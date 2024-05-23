import java.sql.SQLData;
import java.util.Scanner;

public class squareFillPattern {

    public static void squarePattern (int rows) {

        // en dıstakı dongu
        for (int i = 0; i < rows; i++) {
            // sutunlar ıcın dongu
            for (int j = 0; j < rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // ıcı dolu dıkdortgen

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many rows will be on pattern : ");
        int rows = scanner.nextInt();

        squarePattern(rows);
    }
}
