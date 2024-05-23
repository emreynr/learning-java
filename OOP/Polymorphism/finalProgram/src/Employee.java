public class Employee {

    private  String name;
    private String address;
    private int number;

    // constructor olusturma, base class bu olacak
    public Employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    // mail kontrol eden method
    public void mailCheck () {
        System.out.println("Mailing a check to:" + this.name + " " + this.address);
    }

    // string cevirme
    public String toString() {
        return name + " " + address + " " + number;
    }

    // getter ve setter metodlari


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }
}
