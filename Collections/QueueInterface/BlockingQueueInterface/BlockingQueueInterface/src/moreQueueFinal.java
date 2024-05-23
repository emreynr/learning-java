import java.time.temporal.Temporal;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class moreQueueFinal {

    public void takedDemo() throws InterruptedException {

        // blockingQueue icin kapasıte olusturma
        int capacityOfQueue = 9;

        // BlockingQueue olusturup kapasıte atıyoruz
        BlockingQueue<Employee> queue = new LinkedBlockingQueue<Employee>(capacityOfQueue);
        // hatırladın mı? generics metodlar ıle class adını da hasmap lınkedlıst vs hepsıne tanımlayabılıyorduk
        // genericler icin tekrar pratik yapsam iyi olucak


        //Employee classına aıt obje olusturup bunları BlockıngQueue ye eklıyoruz
        Employee employee1 = new Employee("david", "ceo", "3000");
        Employee employee2 = new Employee("michael", "engineer", "2000");

        queue.add(employee1);
        queue.add(employee2);

        // while ile queue ıcındekı elemanlar bıtene kadar sılmeye devam et
        while (!queue.isEmpty()) {

            Employee removedEmp = queue.take(); // Employee classından yenı bır obje olusturduk ve buna queue ıcınden sılınen elemanı atadık

            System.out.println("removed ıtem ıs: " + removedEmp);
            System.out.println("Employee name: " + removedEmp.name +" ");
            System.out.println("Employee position: " + removedEmp.positon + " ");
            System.out.println("Employee salary: " + removedEmp.salary);
            System.out.println("here is the queue's size: " + queue.size());

        }
    }

    public static void main(String[] args) {
        // blockingQueue ile calısan ekleme ve sılme programı

        moreQueueFinal test = new moreQueueFinal();

        try {
            test.takedDemo(); // mutlaka catch belırtılmelı
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

/**
 *Employee classı olusturuyoruz
 * takeDemo() metodu altında throws ile istisna olusturmakla baslayıp BlockingQueue metodunu yazıyoruz
 * son olarak maın() altında devam edıyoruz
 *
 *
 */