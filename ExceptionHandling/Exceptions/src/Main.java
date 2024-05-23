public class Main {
    public static void main(String[] args) {
        // javada istisnalar, program calıstıgı esnada programın normal akısını bozmak
        // istemeyen ve beklenmeyen bir olaydir.

        /* bu istisnalar yakalanabilir ve islenebilir. yakalama islemi ile belirli atamalar yapılabılır
         */

        /*
        Hata ve İstisna arasındaki en onemli farklar
        hata: bir uygulamanın bir hataya yakalamaması gereken ve program akısını bozan ciddi bir olay
        istisna: akısı bozmaz ama daha iyi bir yol veya giderilmesi gereken kucuk hatalar istisnadir.
         */

        // printStackTrace ile istisna bilgilerini ekrana yazdirma


        // istisna bilgilerini yazdırma yontemleri
        int a = 12;
        int b = 0;

        try {
            System.out.println("result is here: " + (a/b)); // bu islemi dene ve
        }
        catch (ArithmeticException e) {  // cıktı olabılecek bu istisnayi yakala
            e.printStackTrace();
            /* acıklama; istisna bilgileri, istisnanın adı biciminde yazılır: istisnanın acıklaması */
        }
        // ilgisi istisnalar src dosyasının ıcınde var (gorsel olarak)
        int a1 = 21;
        int b1 = 0;

        try {
            System.out.println("result is here: " + (a/b));
        }
        catch (ArithmeticException l) {
            System.out.println(a.toString());  // sadece istisna adi: istisna acıklaması
        }

        int q = 3;
        int q1 = 45;

        try {
            System.out.println("result is here:" + (a/b));
        }
        catch (ArithmeticException y) {
            System.out.println(y.getMessage());  // sadece istisna acıklamasını alır
        }
    }
}
/**
 * ozetle try-catch yapısı nasıl kullanılır
 *
 * try {
 *     // block of code to monitor for errors
 *     // the code you think can raise an exception  --> hata verecegini dusundugun kod blogu
 * } catch (ExceptionType1 exOb) {
 *     // exception handler for ExceptionType1    --> hatayı yakalayıp, bu hata olduguna ne bastırılacagı belırlenır
 * } catch (ExceptionType2 exOb) {
 *     // exception handler for ExceptionType2
 * }
 * // optional
 * finally {  // block of code to be executed after try block ends
 * }
 *
 *
 *
 */