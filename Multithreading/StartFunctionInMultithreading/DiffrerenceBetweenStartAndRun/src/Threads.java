public class Threads extends Thread{

    public void run () {
        System.out.println("current thread name: " + Thread.currentThread().getName());
        System.out.println("run() method is called");
    }
}
