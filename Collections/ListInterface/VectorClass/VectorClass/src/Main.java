import java.util.Vector;

public class Main {
    // https://www.geeksforgeeks.org/java-util-vector-class-java/
    // https://www.geeksforgeeks.org/vector-vs-arraylist-java/
    public static void main(String[] args) {

        /*
        vector sinifinin buyuklugu surekli olarak degisir
        mesela basta 3 elemanli olan bir dizi icin eger bir eleman
        silinirse artik dizinin boyutu 2 olur.

        arraylist icinde bir eleman sildigimiz zaman elemanlari bastirdigmizda
        bir eleman silik olur fakat halen dizinin boyutu ayni kalir.

        yani vektorlerde dizinin boyutu eleman ekleme ve cikarma ile surekli
        olarak degisir

        arraylist gibi sıralı bır sekılde ekleme yapar.

        vector kapasıtesını arttırma ılgılı noktaalar:
        - artıs belırtılırse vector her dongude ona gore genısler
        - vectorde kapasıtesının artıs degerı. depolanan oge sayısı ve vectoru
        tutan dızı seklınde uc farklı tanımlama yapılır

         */

        // eger boyutu tanımlanmazsa default olarak 10 elemanlık olusturur
        int n = 12;

        Vector<Integer> vector = new Vector<Integer>(n);

        for (int i = 0; i <= n; i++) {
            vector.add(i);
        }
        System.out.println(vector);

        vector.remove(9); // 9. ındextekı degerı sıler
        System.out.println(vector);
        for ( int i = 0; i < vector.size(); i++) {
            System.out.println("here is the number: " + vector.get(i));
            // i. ci indexi alıp bastıracak
        }

        System.out.println("****************************************");
        // vectorlerde de elemanların sırasıyla eklendıgı soylemıstık



        Vector<Integer> vector2 = new Vector<Integer>();

        vector2.add(4);
        vector2.add(1,12);
        // vectorlerde elemalar sıralı sekılde eklenmelı
        // oyle ındex atlayarak deger ekleyemezsın

        System.out.println(vector2);

        // eleman degıstırme
        vector2.set(0, 56); // 4 tu 56 olacak

        // eleman sılme
        // vector2.remove(2);
        // 2. ındextekı degerı sıler

        // for each ıle bastırma
        for (Integer i : vector2) {
            System.out.print(i + " ");
        }

        /*
        vectorler senkronıze olarak calısırlar, bunun anlamı bırden fazla
        ıs parcacıgının aynı vectorde sorun yaratmadan calısacagı anlamına gelır.
        fakat bununla bırlıkte sureklı senkronze bır yapının cıddı performans
        malıyetıne neden olur.

        kısaca avantajları:
        senkronızasyon,
        senkronıze oldugu ıcın coklu ıs parcacıklı bır ortamda kullanmayı
        daha guvenlı hale getırır

        dınamık boyut,
        vectorun boyutu ogeler eklendıkce ve cıkarıldıkce sureklı olarak degısır.
        bu sebeple baslangıcta bır boyut ayarlamaya gerek yoktur.

        kısaca dezavantajları:
        performans,
        vectorlerın senkronıze yapısı arraylıst ıle karsılastırıldıgında daha yavas
        bır performansa sebep olabılır

        gereksiz yuk,
        vectore ıhtıyac olmadıgı zaman kullanmak projeye gereksız yuk bınmesıne sebep olur

         */
    }
}