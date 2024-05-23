public class ageControl extends Exception {

    public static void print(int age) {

        if(age >=18) {
            System.out.println("u can vote.");
        }
        else {
            throw new IllegalArgumentException("u cant vote, go grow");
        }
    }
    public static void main(String[] args) {

        print(7);

    }
}
