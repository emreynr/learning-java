public class Main {
    public static void main(String[] args) {
        // https://www.javatpoint.com/thread-scheduler-in-java gorseller ile de desteklenmis



        /*
        hangi threadin ne zaman ne sure ile calisacagine threadScheulder karar verir.
        birden fazla thread oldugu zaman bunlarin hangi sirayla isleme alincagina karar verir


        ThreadScheulder algoritmalari
            - ilk gelen ilk servis edilir algoritmasi;
                bu algoritmada ilk gelen threadi isleme alir

            - zaman dilimleme algoritmasi; (time slicing)
                sonsuz durumda bekleyen threadler icin zamanliyici atar. mesela normalde sonsuz sure bekleyecek olan
                bir thread icin, suan islemde olan thread icin bir sure belirler ve o sure bitince mecburen islemde olan
                thread cekilir ve sirada bekleyen thread getirilir.

            - onleyici oncelikli planlayici; (preemtive-priority scheduling)
                calisabilir durumda birden cok thread oldugunu varsayalim.
                ThreadScheulder en yuksek onclige sahip olan threadi secer, algoritma ayni zamanda
                onleyici oldugundan acikta bir thread kalmamasi icin islemde olanlar icin de zamanlayici uygular.
         */

        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo threadDemo1 = new ThreadDemo();
        ThreadDemo threadDemo2 = new ThreadDemo();

        System.out.println(threadDemo.getPriority()); // oncelik sirasini ekrana bastirir
        System.out.println(threadDemo1.getPriority());
        System.out.println(threadDemo2.getPriority());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        // simdi ise bu threadlerdeki oncelik siralarini ayarlayalim
        threadDemo.setPriority(1);
        threadDemo1.setPriority(2);
        threadDemo2.setPriority(6);

        System.out.println(threadDemo.getPriority());
        System.out.println(threadDemo1.getPriority());
        System.out.println(threadDemo2.getPriority());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");


        // suanda islemde olan threadi gosterir
        System.out.println("current running thread: " + Thread.currentThread().getName());

        System.out.println("main thread priority: " + Thread.currentThread().getPriority()); // oncelikli olan thread hangisi

        // main threadin onceligini degistiriyoruz
        Thread.currentThread().setPriority(10);

        System.out.println("main thread priority: " + Thread.currentThread().getPriority());
    }
}