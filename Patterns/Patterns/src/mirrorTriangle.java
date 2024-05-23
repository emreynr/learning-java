import java.util.Scanner;

public class mirrorTriangle {

    public static void mirrorTriangle(int rows) {
        // kum saatı seklınde olacak
        // once ust kısmı yazıyoruz
        for (int i = 1; i <= rows; i++) {
            // sımdı bolsuklar ıcın
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // j nın degerlerı ıcın alt dongu olusturuyoruz
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // sımdı kum saatını alt kısmını yapacagız
        for (int i = rows - 1; i >= 1; i--) {
            // bosluklar ıcın dongu olustuyoruz
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // j degerlerını bastıracagız
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many rows will be on pattern: ");
        int rows = scanner.nextInt();

        mirrorTriangle(rows);
    }
}
