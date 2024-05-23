import java.lang.reflect.Array;
import java.util.Arrays;

public class UtilArraysVSReflectArrays {
    public static void main(String[] args) {
        /* java.lang.reflect paketı ıcınde Array sınıfı, Java Reflectionun bir parcasıdır bunu control + soltık
        yaparak hangı paketlerden geldıgını vs hepsını gorebılırsın). bu sınıf, Java dizilerini dinamık olarak
        olusturmak ve bunlara erısmek icin statik yontemler saglar. en son sınıftır, yani somutlastırılamaz ve
        degistirilemez. yani bu sınıfın yontemlerı, sadece sınıf adının kendısı tarafından kullanılabılır.



        java.util paketindeki Arrays sinifi, Java Collection Framework'un bir parcasıdır. bu sınıf, Java dizilerini
        dinamık olarak olusturmak ve bunlara erısmek ıcın statık yontemler saglar. yalnızca yontemlerden ve Object
        sınıfının yontemlerınden olusur. Bu sınıfın yontemlerı sınıf adının kendısı tarafından kullanılabılır.  */


        // ikisi arasındakı en onemlı ve temel farklar
        // Array sınıfı, Java dizilerini dinamik olarak olusturmak ve bunlara erısmek ıcın static yontemler kullanır
        // Arrays sınıfı, dizileri islemek icin cesıtlı yontemler ıcerır( sıralama ve arama gibi)

        int[] array = new int[33]; // bellekte 33 elemanlık yer acar

        // array setInt kullanımı, hangı dızıde kacıncı ındexe ne atanacagı belırtılır
        Array.setInt(array, 4, 66);

        System.out.println(Arrays.toString(array)); // stringe cevrılmezse anlamsız bır deger cıkıyor







    }
}
