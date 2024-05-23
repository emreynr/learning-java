public class Employee {
    // bu uc degıskenı prıvate yaptıgım zaman ana class altında erısemedım
    // public yaptım, ya da getter ve setter ile de erisebilirdim denemedim.

    public String name;
    public String positon;
    public String salary;

    //degerlere daha sonra erısebılmek ıcın constructor olustuyoruz
    public Employee(String name, String positon, String salary) {
        this.name = name;
        this.positon  = positon;
        this.salary = salary;
    }

    // bunu baska metod ıle de yapablırız fakat en kolay yolu bu
    // toString return ile tum degerleri return ediyoruz
    public String toString () {
        return "Employee name: " + name + " Employee position: " + positon + " Employee salary: " + salary + "TL";
    }
}
/*
bu class altından calısan ısım maas ve pozısyon bılgılerı alacagız
 */
