import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        /*
        Exectutor aslinda bir thread yonetim mekanizmasidir. yani hangi thread ne zaman calisacak ve ne zaman yurutulup isi bitirilecek
        karar verer mekanizmadir. Executor Framework olarak gecer
         */

            // thread havuzu olusturma
            ExecutorService executorService = Executors.newFixedThreadPool(5); // 12 threadlik havuz olusturma

            for (int i = 0; i < 4; i++) {
                Runnable worker = new WorkerThread(" " + i); // WorkerThread icin obje referansi olusturma
                executorService.execute(worker);
            }

            executorService.shutdown();


            while (!executorService.isTerminated()) { // islem sonlandirilmadigi surece
            }

            System.out.println("finished all threads");
    }
}
