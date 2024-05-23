import java.util.Scanner;

public class DiamondStar {

    public static void diamondStar (int rows) {

        for (int i = 1; i <= rows; i++) {
            // bosluk yazdırmak ıcın for dongu
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            //bosluk bastırma
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            // yıldız bastırmak ıcın ıc for dongusu
            for (int k = 1; k <= 2 * i -1; k++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" how many rows will be on pattern? : ");
        int rows = scanner.nextInt();

        diamondStar(rows);
    }
}
