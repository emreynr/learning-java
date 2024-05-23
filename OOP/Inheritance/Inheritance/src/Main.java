public class Main {
    public static void main(String[] args) {
        /*
        Inhertance yani kalitim, java da bir sinifin, baska bir sinifin
        ozelliklerini kullanmasina olana taniyan bir olusumdur.
        - mevcut siniflara dayali yeni siniflar olusturmaya dayalidir
        - baska bir siniftan miras alan bir sinif, o sinifin yontemlerini ve
        alanlarini yeniden kullanabilir. mevcut sinifa ek ozellikler de eklenebilr

        kisaca Java Inhertance yapisi neden kullanilir?
        - super classta yazilan(yani bir ust sinif) tum alt classlar icin ortak olur
        - method overriding(gecersiz kilma) yalnizca Inhertance ile elde edilebilir
        method overriding yapildigi zaman, overriding yapan classin metodu
        artik gecerli olmaz ve super classin metodu gecerli olur.
        - abstraction yani soyutlama kavramina Inheritance ile ulasilir,
        yani kullanici yalnizca ihtiyaci olan metodlari kullanir ve kullanmayacagi
        metodlari gormez( bir onceki program interface de bunu yaptik)

        onemli ve bilinmesi gerekenler;
        super class: ozellikler bu class(super class) uzerinden miras alinir. yani ust siniftir
        sub class: diger classtan miras alan classtir. sub class( turetilmis class,
        genisletilmis class veya sub class) olarak bilinir. eger sub classta
        istenirse sadece o sub classa ait olan yontemler ve ozellikler eklenebilir.

        yeniden kullanilabilirlik: Inhertance bu kavrami destekler. yani yeni bir class
        olusturmak istedigimizde ve istedigimiz kodun bir kismini iceren bir class zaten
        mevcut oldugunda, yeni classi mevcut classtan turetebiliriz. bunu yaparak mevcut
        classin ozelliklerini yeniden kullaniyoruz


        daha fazla teori yok simdi ornek zamani, interface ile bu mantgina cok benzerini
        zaten kullanmistik
         */

        MountainBike mountainBike = new MountainBike(3, 200, 30);
        System.out.print(mountainBike.toString());

    }
}