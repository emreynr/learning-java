public class myException extends Exception {
// Exeption sinifindan kendimiz Exception olusturmak icin bu classı extends edebiliriz

    private static int accountNo[] = {2000, 200, 123, 2323};
    private static String names[] = {"david", "lara", "sarah", "trac"};
    private static double balance[] = {100,200,300,400,544};

    //kendi Exception'unumuz icin constructor olusturuyoruz, cunku bunu ilerde cagıracagız
    myException() {

    }
    myException(String str) {
        //str icin super degisken diyebilriz cunku bunu ilerde miras alacagız
        super(str);
    }

    public static void main(String[] args) {

        try {
            System.out.println("ACCOUNT NO\t" + "NAMES\t" + "BALANCE");

            for( int i = 0; i < names.length; i++) {
                System.out.println(accountNo[i] + "\t" + names[i] + "\t" + balance[i]);
                if (balance[i] < 150) {
                    myException me = new myException("this users balance lower than 100");
                    throw me;
                }
            }
        }
        catch (myException e) {
            e.printStackTrace();
            // throw komutu: kotrölü try blogundan alıp catch bloguna aktarır
        }
    }
}
/**
 *
 * kendi exception'unumuzu olusturmak icin Exception sınıfıdan extends etmeliyiz
 * kullanacagımız dizileri olusturuyoruz( myException snıfı altında)
 * try altında balance 150 altında olan degerleri cath ile yakalamak icin referans olusturuyoruz
 *
 * UNCHECKED AND CHECKED EXCEPTIONS
 *
 * Checked exception: bunlar derleme sırasında kontrol edilen hatalardır. bir yontem icindeki bazı kodlar
 * kontrol edilne bir istisna atarsa, bu durumda yöntemin ya bu istisnayı işlemesi ya da throw sözcüğü kullanarak
 * istisnayı belirtmesi gerekir. Örnegin dosya okumasını yaparken eger dosyayı okuyamazsa program derlenemez ve
 * FileNotFoundException istisnasını döndürür
 *
 *
 * Unchecked exception: bu istisnalar ise derleme zamanında kontrol edilmeyen istisnalardır. derleyicinin
 * calısmasına izin verir koddan kaynaklı istisnalari dondurur. sıfına bolme islemini daha once yapmıstık ve
 * program derlenmıstı ama sıfıra bolundugunde belirsizlik oldugu icin istisna dondurmustu
 * ozetle; unchecked istisna derleyicinin derlemesine izin verir hata olmaz
 * cheched istisnalar ise derlemeye izin vermez cunku programın akışını bozan bir durum vardır ve bunu döndürür.
 */