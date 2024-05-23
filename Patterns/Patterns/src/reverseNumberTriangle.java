import java.util.Scanner;

public class reverseNumberTriangle {

    public static void reverseTriangle (int rows) {

        for (int i = 1; i <= rows; i++) {
            // bosluklar ıcın prınt
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // j nin degerlerinı dondurme
            for (int k = i; k <= rows; k++) { // rows yerıne 1 yazıldıgı zaman rhombus olusur
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        // ters yıldız pyramid

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many rows will be on pattern : ");
        int rows = scanner.nextInt();

        reverseTriangle(rows);

        // sayı yerıne sadece yıldızlarla sa yapılabılır tabı



    }
}
