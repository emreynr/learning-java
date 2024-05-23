public class Student {

    int id;
    String name;
    int rollNo;
    public void insertRecord (int roll, String nameOf) {
        rollNo = roll; // bu metod icindeki degeri class degerlerine
                        // esitledik
        name = nameOf;
    }
    public void displayInformation() {
        System.out.println(rollNo + " " + name);
    }
}
/**
 * insertRecord metodu, aldigi degerleri Student classi altindaki
 * degelere esitletecek
 *
 * display metodu, insert metodu bu degerleri classtaki degerlere
 * esitledikten sonra bunlari alip gosterecek
 *
 */