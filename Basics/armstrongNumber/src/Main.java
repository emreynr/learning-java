import java.util.Scanner;

public class Main {

    static boolean isArmstrong(int enteredNumber) {
        int sum = 0;
        int temp = enteredNumber;

        while ( enteredNumber > 0) {
            int lastDigit = enteredNumber % 10;
            enteredNumber = enteredNumber / 10;
            sum = sum + lastDigit*lastDigit*lastDigit;
        }
        if ( enteredNumber == sum) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        //armstrong sayı, girilen 1455 girildi, her bir elemanın o sayıdakı eleman sayısı kadar ussunu al
        // 1 üssü 4 + 4 üssü 4 gibi devam et, cıkan sonuc girilen sayiya esitse armstrong sayı
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        System.out.println(isArmstrong(s));
    }
}