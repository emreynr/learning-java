import java.io.*;
public class Main {
    public static void main(String[] args) {

        /* kapsullemeye ornek program
         */

        Encapsulate encapsulate = new Encapsulate();

        System.out.println(encapsulate.getBroAge());
        System.out.println(encapsulate.getBroName());
        System.out.println(encapsulate.getBroRoll());
        System.out.println("---------------------------");

        encapsulate.setBroAge(12);
        encapsulate.setBroName("david");
        encapsulate.setBroRoll(1);

        System.out.println(encapsulate.getBroAge());
        System.out.println(encapsulate.getBroRoll());
        System.out.println(encapsulate.getBroName());



        // eger direkt olarak bu class uzerınden broAge erısmek ıstersek?
        // encapsulate.broAge = 21; // private access hatası alırız ****
        // eger bu class altından da erısmek istiyorsak private olan
        // identifier'i public yaparız

    }
}