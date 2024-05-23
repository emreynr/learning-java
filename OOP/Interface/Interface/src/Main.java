public class Main {
    public static void main(String[] args) {
        // Interface classi IS-A iliskisine sahiptir
        // yani, kopek bir hayvadir derken burada IS-A iliskisi vardir
        //
        // asil amac abstraction yani soyutlamadir

        bicycle bic = new bicycle();
        // mesela bicycle altinda constructor yok o yuzden burada obje
        // olustururken deger atamiyoruz

        bic.changeGear(5);
        bic.speedUp(6);
        bic.applyBrakes(2);

        System.out.println("bicycle current status:");
        bic.printStates();

        bike bike1 = new bike();
        bike1.changeGear(2);
        bike1.speedUp(3);
        bike1.applyBrakes(1);

        System.out.println("bike current status:");
        bike1.printStates();

        Vehicle vehicle = new Vehicle();
        // bu sekilde abstract yani soyut bir sinif icin obje
        // olusturamayiz
        // https://www.guru99.com/java-abstract-class-method.html
        // Interface uzerinden istedigimizi alip kullanabiliriz
        // Vehicle interface altinda ortak olan ozellikleri alabilir
        // ve sonradan olusturacagimiz farkli siniflar icin kullanabiliriz
        // https://www.geeksforgeeks.org/extends-vs-implements-in-java/

        /*
        interface'nin bize sagladigi en ama en buyuk avantaj metodlari tekrar tekrar yazmaktan kurtarmasidir.
        mesela hem bicycle classi hem de bike classi icin ayri ayri changeGear metodu yazmak yerine interface classi altinda bir kez tanimladik.
        boylece classlar bunu alip istedikleri gibi sekillendirebilir ve kullanabiliriz, interface altinda tanimli metodun bos govdeli olmasininin sebebi budur
         */


    }
}