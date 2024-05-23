public class Main {
    public static void main(String[] args) {

        // person classı ıcın obje olusturma
        Person person1 = new Person();

        person1.setAge(22);

        // degıstırılen age degerıne erısım
        System.out.println("user age: " + person1.getAge());

        person1.age = 12;


        /*
        age degeri private oldugu icin bu degere, bu degere bu class
        dısından erısılemez
         */

        // person1.age = 12;
        // bu sekılde dırekt erısım saglayamayız zaten hata verır.
        // yanı baska bır class uzerınden veri degisikliği yapamıyoruz
        // sadece getter setter metodları ıle erısım saglayabılırız
    }
}