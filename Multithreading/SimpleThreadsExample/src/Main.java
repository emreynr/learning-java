public class Main {
// https://docs.oracle.com/javase/tutorial/essential/concurrency/simple.html


    public static void threadMesseage (String messeage) {

        String threadName = Thread.currentThread().getName();
        System.out.println("here is the thread name: " + threadName);

    }

    public static class MesseageLoop implements Runnable {

        @Override
        public void run() {
            String info[] = {
                    "cocuk adam",
                    "sarah",
                    "michael",
                    "david"
            };
            try {
                for (int i = 0; i < info.length; i++) {
                    // 4 saniyede bir bekleme suresi ekleme
                    Thread.sleep(1500);
                    threadMesseage(info[i]);
                    // threadin ozelliklerini yazdirmayi ayri bir metod icinde yaptik
                }
            }
            catch (Exception e) {
                System.out.println("henuz isim bitmedi bro");
            }
        }
    }

    public static void main(String[] args) throws  Exception{
        // buradaki uygulaama yapiliyor

        long patience = 1000 * 60 * 60;
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            }
            catch (NumberFormatException e) {
                System.err.println("deger integer olmali bro ");
                System.exit(1);
            }
        }

        threadMesseage("Starting thread messeageLoop");
        long startTime = System.currentTimeMillis();
        Thread thread = new Thread(new MesseageLoop());
        thread.start();

        threadMesseage("waiting for MesseageLoop thread to finish");

        while (thread.isAlive()) { // thread olmedigi surece
            threadMesseage("halen bekleniyor...");
            thread.join();

            if (((System.currentTimeMillis() - startTime) > patience) && thread.isAlive()) {
                threadMesseage("bro yeter halen bekliyorum");
                thread.interrupt();
                thread.join();
            }
        }
        threadMesseage("SONUNDA");
    }
}