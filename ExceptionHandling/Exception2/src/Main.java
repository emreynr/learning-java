public class Main {


    class throwException {

        static void help() {
            try {
                throw new  NullPointerException("unkkown error");
            }
            catch (NullPointerException e) {
                System.out.println("caught inside help()");
                throw e;
            }
        }
    }

    public static void main(String[] args) {

        try {
            throwException.help();
        }
        catch (NullPointerException e) {
            System.out.println("caught in main error name given below"); // yakalanan hata asagıda belirtildi
            System.out.println(e);
        }
    }
}
/**
 * Program nasıl calısıyor?
 *
 * help metodu ile once
 */