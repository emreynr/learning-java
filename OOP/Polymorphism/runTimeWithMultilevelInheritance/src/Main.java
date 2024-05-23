public class Main {
    public static void main(String[] args) {
        /*
        aslinda pek fark yok, bir onceki ornekte bir base class ve bir sub class
        vardi. simdi ise base class sub class ve sub class altinda bir sub class daha olucak
        BabyDog extends Dog, Dog extends Animal      boyle

         */

        Animal animal = new Animal();
        animal.eats();

        Animal dog = new Dog();
        dog.eats();

        Dog babyDog = new BabyDog();
        babyDog.eats();

        //her bir class kendi metodunu kullanarak override yapmis oldu

        Animal a = new BabyDog();
        a.eats();


    }
}