public class Main {

    public static void main(String[] args) {

        /*

       Bir Thread'in Lifecyclesi(yasam dongusu)
       javada bir thread her zaman asagidaki durumlarin herhangi birinde bulunabilir;
        1 - New
        2 - Active
        3- Blocked/Waiting
        4 - Timed Waiting
        5 - Terminated

            1 - New;
                yeni bir thread olusturuldugunda bu yeni durumdadir. yeni durumdaki thread icin kod
                henuz calistirilmadi ve dolayisiyla yurutulmeye baslanmadi.
            2 - Active;
                bir thread start() keyi ile cagirildiginda new durumundan Active durumuna gecer.
                Active durum icinde de iki farkli durum icerir. bunlar Runnable ve Running
                    Runnable;
                        calismaya hazir bir thread daha sonra runnable duruma tasinir.
                        Runnable durumda thread calisiyor olabilir veya herhangi bir zamanda calismaya
                        hazir olabilir. her bir thread kisa bir sure boyunca calisir ve ona tahsis edilen
                        zaman bittiginde CPU'yu baska bir threade gonullu olarak devreder, boylece diger
                        threadlerde kendilerine tahsis edilen sureler boyunca calisabilir. boyle bi durumda
                        calismaya hazir olan ve calistirilma sirasini bekleyen threadler Runnable durumda kalir.
                        Runnable durumda, threadlerin bulundugu yerde bir kuyruk vardir.
                    Running;
                        bir thread sirasi gelip CPU'ya alindiginda Runnnable durumdan Running durumuna gecer.
                        buradan sonra kendisine ait bir gorev daha varsa tekrardan Runnable duruma gecebilir.
            3 - Blocked/Waiting;
                bir thread belirli bir sure boyunca(kalici olarak degil) etkin durumda olmadiginda, bu thread ya blocked
                ya da Runnable durumdadir.
                ornegin, A adinda bir thread yazicidan veri yazdirmak istiyor. ayni zamanda da B adinda bir
                thread bazi verileri yazdirmak icin suanda yaziciyi kullaniyor. bu nedenle A threadinin
                B threadinin isi bitene kadar beklemesi gerekir. yani A threadi suanda bloklanmis durumdadir.
                blocked durumdaki bir thread herhangi bir islem gerceklestiremez ve asla CPU dan kaynak tuketmez.
                ozetle A threadi tekrardan etkinlestirilene kadar A threadi bosta bekler.

                bekleme durumda veya engellenmis durumda cok sayida thread varsa hangi threadin
                secilip hangisinin reddedilecegine iliskin karari thread zamanlayicisi kara verir.

           4 - Timed Waiting;
                bekleme durumu bazen bosluga sebep olur. ornegin, adi A olan thread kodun kritik kisminda
                dahil olmustur ve kritik bolumden ayrilmaya niyetli degildir boyle bir durumda B adinda bir threadin
                sonsuza kadar beklemesi gerekir ve buda bosluga sebep olur. bunu onlemek icin B threadi icin Timed Waiting
                bir bekleme durumu verir. boylece B thredi sonsuza kadar degil zamanlanmis sure kadar bekler.
                bunun bir ornegi sleep() ile yapilir. uyku durmunda olan thread suresi gelene kadar uyku
                durumunda kalir ve bekleme suresi bittiginde uyanir ve isine kaldigi yerden devam eder.

           5 - Terminated;
                bir threadin belirli sebepleden dolayi sonlandirilmasidir.
                bir thread isini bitirdiginde normal veya anormal sekilde sonlanir.
                    Anoormal Sonlandirma;
                        islenmeyen bir istisna veya segmentasyon hatasi gibi bazi ongorulmeyen durumlar
                        meydana geldiginde meydana gelir.

                Sonlandirilmis bir thread, artik sistemde yeri yoktur. yani bu thread artik olu bir threadtir ve
                bir thread oldukten sonra tekrar kullanilmasine imkan yokur.



         */

        //threadlerin implementasyonu
        






    }
}