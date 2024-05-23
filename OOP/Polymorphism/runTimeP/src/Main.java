public class Main {
    public static void main(String[] args) {
        /*
        splendor classi, Bike classini extend ederek Bike altindaki
        run() metodunu gecersiz kilacak ve kendi metodu baskin olacak

         */

        Bike b = new Splendor();
        b.run();
        // Splendor classi, Bike classindaki metodu override ederek
        // kendi metodunu kullanmis oldu
        // implements ile karistirma burada Bike classina ait Splendor classina referans
        //olan bir obje olusturuyouz


    }
}