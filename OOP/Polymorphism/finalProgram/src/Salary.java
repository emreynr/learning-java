public class Salary extends Employee{
    // extend ettikten sonra kullanabilmek icin contructor olusuturulmali

    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);

    }
    //method overriding
    public void mailCheck (){
        System.out.println("within mailCheck of salary class");
        System.out.println("mailing check to: " + getName() + " with salary: " + getSalary());
    }

    //salary icin getter ve setter olusturuyoruz
    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    // son olarak maas odeme bilgisi icin
    public double computePay() {
        System.out.println("computing salary pay for:" + getName());
        return salary / 52;
    }
}
