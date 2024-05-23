public class Student {

    private int sNo;
    private String name;
    private int age;

    // parameterized contructor
    public Student(int no, String Name, int Age) {
        this.sNo = no;
        this.name = Name;
        this.age = Age;
        // girilecek degerlerin bu class altindaki degerle esit oalcagini
        // belirlemis olduk
    }

    public void showInf() {
        System.out.println(sNo + name + age);
    }

    // constructorlar icin de overloading kullanilabilir

    // sadece yas bilgisini kullanan constructor ornegi
    public Student(int age) {
        this.age = age;
    }
}
// ilk contructor ile kullanirsak main() altinda bu classa ait bir
// olusturdugumuzda hata verecek cunku bu uc tane deger almasini istedik
// ikinci yazdigimiz contructor ile overloading yapip kullanici isterse
// sadece yas girebildigi bir durum olusturduk. yani eskiden tum
// degerlerin girilmesi zorunluyken simdi sadece yas bilgisi de
// girebiliriz
