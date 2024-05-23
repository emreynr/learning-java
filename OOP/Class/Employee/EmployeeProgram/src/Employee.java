public class Employee {

    int id;
    String name;
    float salary;

    void insert (int i, String n, float s) {
        // bu metod aldigi degeleri bu class altinda tanimlanmis degerere
        // esitleyecek. bir onceki programda da yapildi

        id = i;
        name = n;
        salary = s;
    }

    void showInformation(){
        // bu metod sadece daha once alinmis bilgileri gosterecek
        System.out.println("id:" + id + " name: " + name + " salary: " + salary);
    }

}
