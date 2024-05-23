public class subThread extends Thread{

    public void run () {
        for (int i = 0; i < 5; i++) {
            System.out.println("subThread is called( mıght be called helper thread");
        }
    }
}
