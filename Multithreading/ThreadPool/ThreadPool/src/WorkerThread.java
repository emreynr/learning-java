public class WorkerThread implements Runnable{

    public String messeage;

    // constructor
    public WorkerThread(String Messeage) {
        this.messeage = Messeage;
    }

    public void run () {
        System.out.println(Thread.currentThread().getName() + " (Start) output: " + messeage);
        processMesseage(); // beklemesi icin ayri mesaj yaziyoruz
        System.out.println(Thread.currentThread().getName() + " (end)");
    }

    public void processMesseage () {
        try {
            Thread.sleep(1500);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
