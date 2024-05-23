import java.util.Scanner;

public class ZeroOneTriangle {

    public static void zeroOneTriangle(int rows) {

        for (int i = 0; i < rows; i++) {
            // sımdı de columslar ıcın for yazacagız
            for (int j = 0; j < i; j++) {
                // bolume gore sınıf veya bır bastır
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // sıfır ve bırlerden olusan soldan baslayan ucgen

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many rows will be on pattern? : ");
        int rows = scanner.nextInt();

        zeroOneTriangle(rows);


    }
}
