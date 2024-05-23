public class sleep extends Thread{

    // benzer ornegi daha once yaptim, run() metodu kullaniyorduk
    public void run () {

        try  {

            for (int i = 0; i < 21; i++) {
                Thread.sleep(1200);
                System.out.println("numbers: " + i);
            }
        }
        catch (Exception e){
            System.out.println("exception is here: " + e);
        }
    }

    public static void main(String[] args) {
        // main thread

        // metodu kullanabilmek icin obje referansi olusturumaliyiz
        sleep thread = new sleep();

        thread.start();
    }
}
