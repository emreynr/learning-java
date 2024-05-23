import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class moreBlockingQueue1 {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(6);
        // kapasitesi olan bir BlockingQueue, Array classindan olusturduk


        try {
            // put ile de element ekleyebiliriz, fakat put ile birlikte kullanmak icin try catch kullanilmali
            queue.put(12);
            queue.put(21);
            queue.put(33);
            queue.put(55);
            queue.put(31);
            queue.put(88);
            System.out.print("content of BlockingQueue: " + queue);

            int temp = queue.take(); // take kullanmak icin mutlaka try catch kullanilmali yoksa hata verir
            System.out.println(" the number removed is: " + temp);
            // take ile sayiyi dizinin icinden aldik ve onu temp adli yeni degere atadik, artik take() ile aldigimiz deger queue nin icinde yok

            System.out.println("content of BlockingQueue: " + queue);
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
