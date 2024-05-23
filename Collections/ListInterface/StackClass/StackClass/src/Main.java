import java.util.Stack;

public class Main {

    static void stackPush (Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            // elemanı itme
        }
    }

    static void stackPop (Stack<Integer> stack) {
        System.out.println("pop operatıon: " );
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    static void stackPeek (Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("element on stack top: " + element);
    }

    static void stackSearch (Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1) {
            System.out.println("element not found");
        }
        else {
            System.out.println("element is found at posıtıon: " + pos);
        }
    }

    public static void main(String[] args) {
        /*
        yapı olarak son gıren eleman ılk cıkar mantıgı benımsenır
        bu proje ıcındekı gorselde de oldugu gıbı vector
        classından extend eder. yanı vectorun alt sınıfıdır
        temel komutları ıse sunlardır;
        push
        pop
        empty
        search
        peek

        yukarıda stackın sıralama ve ekleme ıslemlerını nasıl yaptıgını kavradık.
        bunları yapmaya tabı kı gerek yok fakat stack bır class ve sıralamayı bızım
        yapmamız gerekıyor

         */

        Stack<Integer> stack = new Stack<Integer>();

        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stackPush(stack);
        stackSearch(stack, 12);
        stackSearch(stack, 2);
        /*
        dızıye sırasıyla 0 1 2 3 4 degerlerı gırer fakat cıktı olarak
        bunun tam tersını verır.
        search ile de eger bulursa gosterır bulamazsa metod ıcınde
        yazılanları bastırır
         */



    }
}