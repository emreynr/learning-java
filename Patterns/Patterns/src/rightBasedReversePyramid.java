import java.util.Scanner;

public class rightBasedReversePyramid {

    public static void reversedTriange (int rows){

        // bosluk sayısını hesaplama
        int num = 2 * rows - 2;

        for (int i = rows; i > 0; i--) {
            // bosluklar ıcın for
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            // her donguden sonra degerın azaltılması
            num = num - 2;
            // yıldızlar ıcın prınt
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("how many rows will be on pattern: ");
        int rows = scanner.nextInt();

        reversedTriange(rows);
    }
}
