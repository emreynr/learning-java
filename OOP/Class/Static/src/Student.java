public class Student {
    // static kullanimi hakkinda ornek

    private String name;
    private int no;
    private static String collegeName;

    static int counter = 0;

    // constructor olusturuyoruz
    public Student (String name) {
        this.name = name;
        this.no = setStudentNo(); // metod icinde metod kullanimi
    }

    static int setStudentNo () {
        counter++;
        return counter;
    }



    static void setCollege (String getClgName) {
        // eger static silersek referans alamayip hata verecektir
        // ayrica alti sari cizgili olan kelime icin zaten bu deger sabit
        // neden tekrar static kullandin gibi bir anlam tasiyor
        collegeName = getClgName;
        // universte adi tanimlama icin
    }

    public void getInfo () {
        System.out.println("name: " + this.name);
        System.out.println("no: " + this.no);
        System.out.println("college: " + collegeName);
    }
}
