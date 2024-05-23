public class Main {

    public static void main(String[] args) {

        Student.setCollege("college1");

        Student student1 = new Student("david");
        Student student2 = new Student("michael");

        student1.getInfo();
        student2.getInfo();
        // counter adli degiskeni static yapmadigim icin java bunu
        // her seferinde tekrar tekrar olusturdu ve simdi de cikti olarak
        // surekli sifir aliyoruz
    }
}
/**
 * static anahtari hakkinda
 * - static anahtar kelimesi java da bir degeri veya degiskeni
 * ortak sekilde kullanmak icin kullanilir. yani static kullanilirsa
 * o deger bellekte tekrar tekrar olusturulmaz, kayitli kalir.
 * bu da cok buyuk programlarda degerin tekrar tekrar olusturulmasini
 * engeller ve buyuk bir hiz avantaji saglayabilir
 * tum nesnelere nesnelerde ortak olan ozellikler icin kullanilir.
 * mesela bir sinifta tum ogrenciler ayni universite adini tasir, bunun
 * icin static kullanilabilir.
 *
 * ayrica bu programda da bircok kez deneyimledigim, static olmayan bir
 * obje static bir objeden referans alamaz olayini gormus oldum
 */

/**
 * this kullanimi defalarca yaptik ve bu Student classi altinda da ornegi var
 * this kullanarak constructorda tanimlanmis olan age degerini(yani kullanicidan alinacak)
 * class altinda tanimladigimiz age degerine this kullanarak esitliyoruz
 * boylece karmasa cozulmus oluyor
 */