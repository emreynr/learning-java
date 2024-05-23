import java.util.Scanner;

public class test {

    static public void bakteriHesap(int kacSaat) {
        int bakterSayisi = 1;
        int temp = bakterSayisi;
        for (int loop = 1; loop <= kacSaat; loop++) {
            System.out.println(loop + ".saat sonundakı bakterı sayısı : " + temp * 2);
            temp = temp * 2;
        }
    }
    public static void main(String[] args) {

        // baslangıc bakterı sayısı 1
        // 1. saat sonunda 2, 2. saat sonunda 4, 3. saat sonunda 8 tane olacak
        // bu sekılde gıdecek

        Scanner scanner = new Scanner(System.in);
        System.out.print("kac saat sonrakı bakterı mıktarı lazım? : ");
        int saat = scanner.nextInt();

        bakteriHesap(saat);
    }
}
