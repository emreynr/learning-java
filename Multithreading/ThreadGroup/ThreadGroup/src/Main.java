import java.util.TreeMap;

public class Main implements Runnable{
    public void run () {
        System.out.println(Thread.currentThread().getName()); // suanki calisan thread icin isim degerini alma

    }

    public static void main(String[] args) {

        Main runnable = new Main();

        ThreadGroup threadGroup1 = new ThreadGroup("parrent thread group"); // 1366. satirda bunun kullanimina iliskin ornek var

        Thread thread1 = new Thread(threadGroup1, runnable, " thread 1 ");
        thread1.start();

        Thread thread2 = new Thread(threadGroup1, runnable, " thread 2 ");
        thread2.start();

        Thread thread3 = new Thread(threadGroup1, runnable, "thread 3 ");
        thread3.start();

        System.out.println("thread group name: " + threadGroup1.getName());
        System.out.println("thread group name: " + threadGroup1.getParent()); // ilgili ozellikleri yazdirir

        threadGroup1.list();




    }
}