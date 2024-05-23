public class Main {

    public static void main(String[] args) {
        /*
        sleep metodu her zaman suanda gecerli olan threadin isini sonlandiracaktir.
        bir thread uyurken baska bir thread icin sleep kullanilirsa istinsa ciktisi aliriz.
        sleep herhangi bir deger dondurmez.

         */

        //istisna ihtimaline karsi try catch ile sleep metodunu kullanalim

        try {
            for (int i = 0; i < 12; i++) {
                Thread.sleep(2000);
                System.out.println("using with sleep: " + i);
            }
        }
        catch (Exception e) {
            System.out.println("exception : " +  e );
        }
        // cikti olarak her bir bastirma arasinda 2 sn bekler
    }
}