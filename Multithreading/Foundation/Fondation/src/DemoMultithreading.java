import java.security.spec.ECField;

public class DemoMultithreading extends Thread{
    //extends yerine Runnable uzerinen implement ederekte ayni programi yapabilirdik
    // https://www.javatpoint.com/how-to-create-a-thread-in-java   ikisinin farkli ve basit ornekler ile anlatimi

    public void run() {

        try {
            System.out.println("thread " + Thread.currentThread().getId() + " is running");
            System.out.println("state: " + Thread.currentThread().getState());
            System.out.println(" name: " + Thread.currentThread().getName());
        }
        catch (Exception e) {
            System.out.println("exception caught: "+ e);
        }
    }
}
