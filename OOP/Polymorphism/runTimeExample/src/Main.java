public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.has();

        Animal dog = new Dog();
        dog.has();

        /*
        cat classindan olusturulan bir obje icin artik Animal classindaki
        metodu degil kendine ait olan metodu kullanip override yapmis olduk

        fakat run-time poly kullanici tarafinadn girilen verilerde kullanilamaz
        yani bu durumda override olmaz ve base classtaki kullanicinin girdigi
        veri esas alinir

         */


    }
}