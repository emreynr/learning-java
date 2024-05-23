public class ChatGPT {

    /*
    1 - MEMORY ALLOCTION:
    javada new anahtar kelimesi kullanilarak Object olusturuldugunda
    bu nesne icin belek heap uzerinde tahsis edilir. Heap, dinamik bellek
    tahsisi icin ayrilan bir bellek bolgesidir.

    ornek kullanim -> MyClass object = new MyClass();
    Stack: referans degiskeni olan 'object', stackte saklanir. bu degisken
    heap'teki  nesnenin bellek konumuna isaret eder
    Heap: 'MyClass' turundeki gercek nesne heap'te olusturulur.
    Heap, Young Generation, Tenured(yasli nesil), Metaspace(kalici nesil)
    gibi cesitli bolgelere ayrilir.

    2 - YOUNG GENERATION:
    yeni nesnelerin tahsis edildigi yer burasidir
    young generation, Eden boslugu ve iki survivor boslugu olmak uzere
    uc farkli bolgeye ayrilir
        - Eden Space(eden boslugu): yeni nesneler Eden boslugunda olusur
        - Survivor bosluklari(S0 ve S1): Garbage collection isleminde hayatta
        kalan nesneler bir survivor bosluguna tasinir. nesneler birden fazla
        koleksiyonu hayatta kalirlarsa Tenured'e(yasli nasil) tasinir.

    3 - GARBAGE COLLECTION (cop toplama)
    JVM, gereksiz nesneleri otomatik olarak temizleyerek bellegi otomatik olarak
    yonetir. iki ana turde gereksiz nesne toplama islemi vardir:

        kucuk garbage collection (genc nesil): genc nesilde kisa omurlu nesneleri
        tanir ve toplar. uzun omurlu olanlar buyuk garbage collection kismina tasinir

        buyuk garbage collection (yasli nesil): kucuk ve gereksiz nesne toplamadan
        daha yavas ve daha az siklikla yapilir.

    4 - METASPACE (kalici nesil)
    javanin modern surumlerinde, meta verileri saklayan daha esnek bir boyutlu
    yontemdir.

    5 - MEMORY LEAKS (bellek sizintilari)
    java otomatik olarak bellek yonetimi saglar, ancak her zaman kusursuz olmaz.
    bu tip sizintilar, referanslar kalirken nesnelerin yanlislikla bellekte
    tutuldugunda ortaya cikabilir. bu sebeple ihtiyac duyulmayan nesnelerin serbest
    birakilmalidir.

    6 - TUNING AND MONITORING ( ayarlama ve izleme)
    java, gelistiriclere JVM nin memory management ayarlarini -Xmx( max heap size) ve
    -Xms(first heap size) gibi flaglar aracigiyla ayarlanmasini saglar.
    bu tip araclar bellek sorunlarini ve performans sorunlarini tanimlamada
    yardimci olur.

    fazla yuzeysel fakat guzel bilgiler, main altijdaki birkab linkte gayet
    ayrintili gosterilmis









     */


}
