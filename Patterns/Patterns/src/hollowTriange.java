import java.util.Scanner;

public class hollowTriange {
    public static void hollowTriange(int rows) {

    }

    public static void bakteri(int saat) {

        int bakteri = 1;
        int temp = bakteri;
        for (int i = 1; i <= saat; i++) {
            System.out.println(i + ". saat sonundakı bakterı sayısı : " + temp * 2);
            temp = temp * 2;
        }
    }





    public static void main(String[] args) {

        // ici bos piramit yapımı

        Scanner scanner = new Scanner(System.in);

        System.out.print("how many rows wil be on pattern : ");
        // int rows = scanner.nextInt();


        System.out.print("kac saat sonrakı bakterı sayısı gerek : ");
        int saat = scanner.nextInt();
        System.out.println("baslangıctakı bakterı sayısı: 1");

        bakteri(saat);
    }
}
