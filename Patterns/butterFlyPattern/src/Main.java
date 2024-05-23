import java.util.Scanner;

public class Main {


    public static void butterFly (int rows) {

        // kelebegın ust kısmı ıcın gereklı olan kısım
        for ( int i = 1; i <= rows; i++) {
            // yıldızlar ıcın for olusturma
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // bosluklar olusturma
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // yılsızlar ıcın tekrardan ıc for
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // kelebegın alt kısmı ıcın gereklı kısım
        for (int i = rows; i >= 1; i--) {
            // yıldızları bastıracak kısım
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // bosluklar ıcın tanımlama yapma
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        // once metodu yazıyoruz

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many rows will be on pattern? : ");
        int rows = scanner.nextInt();

        butterFly(rows);




    }
}