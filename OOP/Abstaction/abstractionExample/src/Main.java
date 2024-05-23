public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Circle("yellow", 12);
        Shape shape2 = new Rectangle("blue", 12, 13);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
    }
}