public class Main {
    public static void main(String[] args) {
        // obje olusturmakla basliyoruz

        Salary s = new Salary("david", "UK", 1, 3000);

        Employee e = new Salary("adam", "US", 2, 3400);
        // employee altinda metod varsa bunlar override olacak

        System.out.println("call mailCheck using Salary reference");
        s.mailCheck();

        System.out.println("\n call mailCheck using Employee reference");
        e.mailCheck();


    }
}