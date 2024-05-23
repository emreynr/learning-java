public class Threads extends Thread {

    public void run() {
        try {
            // suanki aktif olan threadi gosterme
            System.out.println("current thread: " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("exception is cauhgt" + e);
        }
    }
}
