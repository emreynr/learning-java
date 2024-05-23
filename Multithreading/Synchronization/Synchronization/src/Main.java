public class Main {

    public static void main(String[] args) {

         /*
        adi ustunde senkronizasyon ile birden fazla threadin birbirinden haberdar bir sekilde calismalarini saglar

         */

        messeageSender send = new messeageSender();
        ThreadedSend s1 = new ThreadedSend("yo yo ", send);
        ThreadedSend s2 = new ThreadedSend(" bye ", send);

        // iki threadi de baslatma
        s1.start();
        s2.start();

        // bir thread calisirken digerini bekler bunu join ile yapar
        try {
            s1.join();
            s2.join();
        } catch (Exception e) {
            System.out.println("bro interrupted bro ");
        }
    }

}