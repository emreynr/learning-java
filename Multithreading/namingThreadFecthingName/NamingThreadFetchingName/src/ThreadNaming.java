public class ThreadNaming extends  Thread{

    //constructor olusutruyoruz cunku isim belirtecegiz
    public ThreadNaming(String threadName) {
        super(threadName);
    }

    public void run () {
        System.out.println("thread is running..");
        // thread cagirildiginda bunu yazdiracak
    }
}
