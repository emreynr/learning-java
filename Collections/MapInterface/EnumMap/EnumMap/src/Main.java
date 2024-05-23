import javax.print.attribute.IntegerSyntax;
import java.util.EnumMap;

public class Main {

    enum days  {MONDAY, FRIDAY, SATURDAY, WEDNESDAY, SUNDAY}

    public static void main(String[] args) {

        /*
        abstractMapı extends eder
        Collections uyesı oldugu ıcın senkronıze olamaz
        hashmapten cok daha hızlı bır yontemdır
        key ve value ılıskısı vardır ve cogu mapte oldugu gıbı bır key ıcın yalnızca bır adet value olabılır
        null degere ızın verılmez ve eger null bırakılırsa ıstısna doner
        sıralıdır fakat bu sırayı bız degıl enummap kendı kuralları cevresınde belırler

         */

        // basit bir kullanımı
        EnumMap<days, String> d = new EnumMap<>(days.class); // mantık olarak days kısmı key degerı alacak, String ise ona referans olmus dege

        d.put(days.SUNDAY, "break");
        d.put(days.MONDAY, "test");
        d.put(days.FRIDAY, "TEST2");
        d.put(days.SATURDAY, "test4");
        d.put(days.WEDNESDAY, "test5 ");  // her bır gun ıcın karsılık gelen degerlerı belırttık
        // enummap te amac goruldugu uzere daha spesıfık key gerektıgı zaman bunu yapmaya olanak saglar

        System.out.print(d.get(days.SUNDAY)); // sunday ıcın karsılık gelen deger
        System.out.println(d.get(days.FRIDAY));

        /**
         * kısaca enumset avantaj ve dezavantajları
         *
         * verılere daha hızlı erısım saglar, spesıfık key olusturdugumuz ıcın sadece numaralar ıle erısmek yerıne ayrıca key ıcınde
         * ısım belırtebılırız
         *
         * sadece belırlı numaralandırma yapılarına ızın verdıgı ıcı cok daha guvenlıdır
         *
         * sıralı keylerdır, buna karar veren ıse enum ıcındekı baska metodlardır
         *
         * farklı bır key turu ıle kullanılamaz bu sebeple kısıtlıdır
         *
         * keyler bır kez olusturulduktan sonra bır daha degıstırelemez
         *
         */






    }
}