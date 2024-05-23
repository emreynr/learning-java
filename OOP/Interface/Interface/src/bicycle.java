public class bicycle implements Vehicle{
    // classi olusturdugumuzda otomatik olarak metodlari
    // implement ediyoruz

    int speed;
    int gear;
    // bicycle classina ait ayrica iki ozellik ekledik


    @Override
    public void changeGear(int gearLevel) {
        gear= gearLevel;
    }

    @Override
    public void speedUp(int Speed) {
        speed = speed + Speed;
    }

    @Override
    public void applyBrakes(int brakes) {
        speed = speed - brakes;
    }

    public void printStates() {
        System.out.println("speed: " + speed);
        System.out.println("gear level:" + gear);
    }
}
// bu classtan sonra bike classi olsuturoyuz
