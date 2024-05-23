public class tryCatch {

    public static void main(String[] args) {

        try {
            int a = 12;
            int b = 0;
            int c = a/b;
        }
        catch (ArithmeticException e) {
            System.out.println("12/0 cannot be divide..");
        }
        // cıktı olarak yukarıdakı hata mesajını verır


    }
}
