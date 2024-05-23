public class Student {

    int rollNo;
    String name;
    String address;

    // constructor olusturma (olusturulan nesnelerı kullanabılmek ıcın mutlaka kullanılmalı
    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.address = address;
        this.name = name;
    }

    // nesnelerı metod ıle bastırmak ıcın
    public String toString() {
        return " name : " + this.name + " address : " + this.address + " rollNo : " + this.rollNo;
    }
}
