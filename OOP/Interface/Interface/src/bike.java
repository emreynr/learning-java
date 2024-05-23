public class bike implements Vehicle{

    int speed;
    int gear;


    @Override
    public void changeGear(int gearLevel) {
        gear = gearLevel;
    }

    @Override
    public void speedUp(int Speed) {
        speed = speed + Speed;
    }

    @Override
    // Vehicle interface'den implement ettigimiz icin icindeki metodlari da
    // implement etmek durumundayiz
    public void applyBrakes(int brakes) {
        speed = speed - brakes;
    }

    public void printStates(){
        System.out.println("speed:" + speed
                + " gear: " + gear);
    }
}
// main() altina gidebiliriz