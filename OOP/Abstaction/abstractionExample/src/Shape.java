abstract class Shape {
    // bu sekıl classından dıger class ozellık mıras alacak
    String color;
    abstract double area();
    public abstract String toString(); // abstact metod

    // bu abstract class ıcın constructor yazacagız
    public Shape(String color) {
        System.out.println("shape constructor called"); //
        this.color = color;
    }

    public String getColor() {
        return color;
    }


}
