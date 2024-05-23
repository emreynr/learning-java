public interface Vehicle {
    // https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
    // ayrica burada abstract metodlar kullanilacak
    // abstract metodlarin govdesinin olmasi zorunlu degil ve alt
    // siniflara ayrilabilirler

    void test () {
        // interface altinda olusturulan metodlarda govde olamaz
        // bu sebeple asagida oldugu gibi abstact metodlar kullanmaliyiz
    }

    // abstract metodlar
    // yukarida yazildigi gibi alt siniflar olusturuyoruz
    void changeGear( int gearLevel);
    void speedUp (int speed);
    void applyBrakes (int brakes);

    /*
     burada her aracta olan ozellikleri abstract method olarak
     tanimliyoruz. her aracta vites azatlma arttirma olayi vardir, bunlari
     daha sonra bisiklet siniflari icin kullanacagiz
    */

}
// Vehicle classi bittikten sonra bicycle classi olusturuyoruz

