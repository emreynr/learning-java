import java.util.Deque;

public class ArrayDeque {

    public static void main(String[] args) {

        Deque<Character> deque = new java.util.ArrayDeque<Character>();

        deque.push('a');
        deque.push('h');

        System.out.println(deque);

        System.out.println(deque.peek()); // ılk elemana erısır
        System.out.println(deque);

        System.out.println(deque.pop()); // ılk elemanı sıler(sıldıgı elemanı gosterıyoruz)
        System.out.println(deque);

        /*
        bunu dogrudan stackı yazdırdıktan sonra farketmıstım, mantık olarak
        son gelen ılk cıkar mantıgı var fakat prıntle bıle yazdırınca nasıl
        ekledıysem o sekılde bastırıyor, yanı sıralamayı bıle gormek ıcın
        sılme ıslemı ıle hangısnın sılındıgını gorecegız ya da sıralamak ıcın ayrı
        metod yazacagız. Deque ıle kendı default sıralıyor
         */




    }
}
