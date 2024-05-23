import java.util.EnumSet;

enum creatingEnum {CODE, LEARN, PUBLISH};

public class Main {

    public static void main(String[] args) {

        /*
        EnumSet, bir grup adlandırılmıs sabiti temsil etme amacına hızmet eder.
        SetInterface'nin numaralandırma turuyle kullanıma yonelık ozel uygulamalardan bırıdır.

        AbstractSet classini extend eder ve SetInterface uygular
        java collect'on framework uyesi oldugu ıcın degıstırılemez
        HashSetten cok daha hızlı  ve yuksek performanslı Set uygulamasıdır.
        EnumSetteki tum ogeler ıcın numaralandırma yapılması gerekır
        null value ızın verılmez. eger yapılırsa NullPoınterExceptıon ıstısnasını dondurur

        EnumSet, hashsetten cok daha hızldır sebebı dogru bucketı bulmak ıcın hernangi
        bır hashcode hesaplaması yapmaz. bunu daha once kullanmıstık ve yazdırdıgımız zaman
        bır elementın hascodenunu hesaplıyorduk
        tum hesaplamalar cok az surede yapılır ve bu sure sabıttır
         */


        // enumu kullanabılmek ıcın onun referasını kullanmalıyız
        // Set olusturma
        EnumSet<creatingEnum> set1, set2, set3 ,set4;

        // element ekleme
        set1 = EnumSet.of(creatingEnum.CODE, creatingEnum.PUBLISH, creatingEnum.LEARN);
        set2 =  EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(creatingEnum.class);
        set4 = EnumSet.range(creatingEnum.CODE, creatingEnum.LEARN);

        System.out.println("set1 : " + set1);
        System.out.println("set2 : " + set2);
        System.out.println("set3 : " + set3);
        System.out.println("set4 : " + set4);
    }
}