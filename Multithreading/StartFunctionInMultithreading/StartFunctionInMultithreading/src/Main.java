public class Main {
    public static void main(String[] args) {

       /*

       javada thread, Runnable implement ederek veya Thread classini extends
       ederek uygulanabilir.
       her ikisi icinde run() islevi overriding yani gecersiz kilar.

       start() in amaci thread icin ayri bir cagri olusturur. ayri olusturulan
       cagrilar icin run() ile birlikte cagirilir.

       start() cagirmayip dogrudan run() metodu ile cagirirsak ne olacak u
       programda gorecegiz

        */

        int k = 12;

        for (int i = 0; i < k; i++) {
            Threads object = new Threads();

            //start() yerine run() kullaniyoruz
            object.run(); // run metodunu calistirdik
            // object.start();
        }
    }
}