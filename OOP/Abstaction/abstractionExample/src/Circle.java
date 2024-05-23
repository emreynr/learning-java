public class Circle extends Shape{

    double radius;
    // yarıcapı alıyoruz


    public Circle(String color, double radius) {
        super(color);
        System.out.println("circle constructoe called.");
        this.radius = radius;
    } // constructor

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2); // alanını bulma
    }

    @Override
    public String toString() {
        return "circle color is: " + super.getColor() + " and area is: " + area();
    }
}
// cırcle classı shape classını extend edıyor, yanı onun ozellıklerını de kullanıyor
