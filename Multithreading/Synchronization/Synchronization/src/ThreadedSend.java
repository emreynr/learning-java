public class ThreadedSend extends Thread{
    private String messeage;
    messeageSender sender;

    // constructor
    public ThreadedSend(String m, messeageSender object) {
        this.messeage = m;
        this.sender = object;
    }

    // thread icin run metodu yaziyoruz
    public void run() {
        synchronized (sender){
            sender.send(messeage);
        }
    }
}
