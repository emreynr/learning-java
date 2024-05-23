import java.util.Stack;
// belirli metodlarin uygulanmasi

public class performinOperationOnStack {

    public static void main(String[] args) {

        // cesıtlı stack ozellıklerını kullanma


        // default stack
        Stack stack1 = new Stack();

        //generics kullanarak olusturma kı genelde boyle yapılır
        // <> ıcınde olan veri tipi generics yanı ıstedıgımızı atayabılırız
        Stack<String> stack2 = new Stack<String>();

        // eleman pushing (ekleme)
        stack1.push("david");
        stack1.push("sarah");
        stack1.push("michael");

        stack2.push("david");
        stack2.push("bro");
        stack2.push("sarah");

        System.out.print(stack2 + "\n");
        System.out.print(stack1);

        System.out.println("********************************");

        System.out.println(stack2.peek());
        // peek ıle dızının en basında bulunan veya dızının en tepesınde
        // bulunan elemanı almak ıcın kullanılır. bu cıktı sarah verır.
        // cunku stacklerde son eleman ılk elemandı ve elemanlar yıne
        // sıra eklenırdı

        System.out.println(" sılınen eleman: " + stack2.pop());
        // eleman sılmek ıcın yıne ıstedıgımız elemanı sılemeyız
        // sıradan baslanmalı. sarah sılınır
        System.out.println("final elements: " + stack2);

        System.out.println("********************************");

        Stack<Integer> stack = new Stack<Integer>();

        // push ıle element ekleme
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        // eleman cıkarmak ıstedıgımız zaman sondan baslayarak cıkarır
        // ve en son 12 cıkar ve dızı bosalır


        System.out.println(stack);
        // cıktısı bostur

        System.out.println("********************************");
        /*
        javada stack cok eskı bır class ve vector classından mıras alır.
        bu, is parcacıgı acısındanguvenlı bır sınıftır ve dolayısıyla ıs
        parcacıgı guvenlıgıne ıhtıyacımız olmadıgında ek yuk ıcerır.
        tek ıs parcacıklı bır ortamda daha guvenlı oldugundan stack kullanımını
        ArrayDeque ıle yapmak daha guvenlı ve yenı oldugu ıcın onerılır
        bır sonrakı sınıfta yer alıyor




         */










    }

}
