public class Rectangle extends Shape{

    // ucgene ozgu olan ozellıklerı belırtıyoruz
    double length;
    double witdth;

    public Rectangle (String color, double length, double width) {
        super(color);
        System.out.println("rectangle constructor called");
        this.length = length;
        this.witdth = width;
    }

    // abstact class olan Shape altındakı metodları ımplements etmemız gerekıyor
    @Override
    double area() { // alan hesaplama metodu
        return length * witdth;
    }

    @Override
    public String toString() { // bastırmak ıcın stringe cevırıyoruz
        return "rectangle color is:" + super.getColor() + " and area is: " + area();
    }
}
