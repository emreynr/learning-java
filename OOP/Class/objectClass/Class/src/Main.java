public class Main {
    public static void main(String[] args) {
        /* obje uc sekilde olusturulabilir
        referans deger ile
        method ile
        constructor ile
         */
        //Student'e erismek icin obje olusturmaliyiz

        Student student1 = new Student();
        Student student2 = new Student();
        // obje olusturuldu

        student1.id = 22;
        student1.name = "david";
        student1.rollNo = 1;
        student2.rollNo = 2;
        student2.id = 212;
        student2.name = " michael";

        System.out.println(student1.id  + " " + student1.name);
        System.out.println(student2.id + " " + student2.name);

        student1.displayInformation();
        student2.displayInformation();


    }
}