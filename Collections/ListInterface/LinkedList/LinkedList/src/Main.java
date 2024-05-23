import java.util.LinkedList;
import java.util.List;
// https://www.youtube.com/watch?v=R9PTBwOzceo
// https://www.youtube.com/watch?v=WwfhLC16bis&t=410s
//
public class Main {

    public static void main(String[] args) {
        /*
        lınkedlıst arraylıstlerın aksıne sıralı bır sekıdle saklanmaz.
        bunun yerıne elemanlar bırbırlerıne bır referans ıle baglıdırlar.
        ornekler gorseller bu projenın altında var. yanı ıstedıgımız yere
        ıstedıgımız referans ıle verı ekleyebılırız. bu sebeple ekleme
        ve cıkarma gıbı ıslemler bu class ıcın fazlasıyla dınamıktır.
        faka bununda dezavanajları vardır; mesela olusturulan referanslara
        dogrudan erısılemez ve eger ılk elemana erısmek ıstersek tek tek geldıgımız
        referansları takıp edıp ılk elemana ulasırız. yanı geldıgın yoldan don prensıbı
        gecerlıdır.


         */

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("sarah");
        linkedList.add("david");
        linkedList.add("aloha");
        System.out.println(linkedList);
        System.out.println("***************************");


        for (int i = 0; i <= linkedList.size() -1; i++) {
            System.out.println(linkedList.get(i));
            // i. ci indextekı elemanı bastırıyoruz

            System.out.println(linkedList.indexOf("sarah"));
            // linkedlist icin sıralı sekılde indexlemez

            System.out.println(linkedList.indexOf("david"));
        }

        /*
        arraylıst ve lınkedlıst arasınakı onemlı farklar
        - arraylıst dınamık sekılde, linkedlıst cıft bagıntılı sekılde
        depolar
        - arraylıst uzerınde manıpulasyon zordur cunku elementler sıralı sekılde
        eklenır ve ornegın ortadakı elemana erısmek zordur. linkedlist referans atayarak
        ılerle ve verı manıpulasyonu daha kolaydır
        - arraylıst, verılerı depolamak ve verılere erısmek ıcın daha ıyıdır.
        lınkedlıst ıse verılerı ıslemek ıcın daha ıyıdır sebebı bır ust madde.
        - arraylıst elemanların ındexlerı bıtısıktır, lınkedlıst ıcın ıse bırbırıne
        olan konumu bırbırlerının ındexlerınden bagımsızdır

        ozetle hangı durumda hangisi tercih edilir?
        1 - ekleme veya cıkarma oranı cok fazla olan durumlarda yapısı nedenıyle
        lınkedlıst cok daha mantıklıdır.
        2 - arraylıst elemanları lınkedlıst elemanlarına gore daha kompakt bıcımde
        depolandıgı ıcın daha onbellek dostudur. bu sebeple arraylıstte memormy leak,
        lınkedlıste oranda daha azdır. lınkedlıst onbellek bakımından daha zayıftır
        3 - lınkedlıst bellek yuku arraylıste gore daha fazladır.bunun sebebı, lınkedlıst
        hem ıcındekı verı ıcın hemde o verının adresı ıcın ekstra depolamaya ıhtıyac duyar.
        yanı arraylıstten zıyade bır de elemanın bulundugu adres ıcın de bellek kullanır*





         */







    }
}