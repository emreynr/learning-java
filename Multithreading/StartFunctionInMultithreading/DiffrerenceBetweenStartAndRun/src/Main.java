public class Main {
    // https://www.geeksforgeeks.org/difference-between-thread-start-and-thread-run-in-java/?ref=lbp

    public static void main(String[] args) {

        /*
        thradlerde run() ve start() cok onemli iki yontemdir.
        bu ikisi arasindaki bazi farklar ise;

            1 - yeni bir thread olusturma;
                start() ile cagirildiginda yeni bir thread olusturulur ve artindan
                run() yontemi calistirilir. ancak run() yontemi dogrudan cagirilirsa
                yeni bir thread olusturulmaz ve run() yontemi, gecerli cagiran threadin
                kendisinde normal bir yontem cagrisi olarak calistirilir ve multithreding
                gerceklesmez.


         */

        Threads thread = new Threads();
        //thread.start();
        /*
        kisaca ne oldugunu aciklamak gerekirse;
        start() metodu ile cagirdigimizda varsayilan olarak Thread-0 dan
        yeni bir thread olusuturuyor ve daha sonra run() metodu cagiriliyor ve
        icindeki hersey calistiriliyor.

         */

        // peki direkt star() kulllanmadan run() kullanirsak?
        thread.run();

        // goruldugu gibi run() ile cagirinca yeni bir thread olusturmuyor,
        //run() metodu zaten mecvut olan thread uzerinde calistiriliyor.
        //haliyle multithreading gerceklesmemis oldu.


        /*

        ayni thrad objesi icin birden fazla start() kullanilamaz fakat
        rnu( metodu kullanilablir .

         */




    }
}