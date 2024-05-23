
public class Bicycle {
    // base class yani ana sinif

    private int gear;
    private int speed;

    // bu classtaki degiskenlere erisim icin constructor
    public Bicycle(int Gear, int Speed){
        this.gear = Gear;
        this.speed = Speed;
    }

    // Bicycle classina ait 3 metod olacak
    public void applyBrake(int descraseSpeed) {
        speed = speed - descraseSpeed;
    }
    public void speedUp(int incraseSpeed) {
        speed = speed + incraseSpeed;
    }
    public String toString() {
        //toString() metodu ile bilgileri string olarak yazdirma
        return ("no of gears are: " + gear + "\n"
                + " speed of bicycle is: " + speed);
    }

}
// base class olusturduk simdi sub-class olusturuyoruz(MountainBike)
