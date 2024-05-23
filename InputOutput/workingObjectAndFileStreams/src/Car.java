import java.io.*;
// birkac obje belırleyıp bu objeleri fileStreamler ile birlikte belirli bir dosyanın ıcıne atacagız


public class Car implements Serializable {

    private String make;
    private int year;
    private static final long serialVersionUID = 1L;

    public Car (String make, int year) {
        this.make = make;
        this.year = year;
    }
    // bu class altındakı degerlerı erısebılmek constructor da tanımladık artık maın() metodu altına gecebiliriz

    public static void main(String[] args) throws IOException, FileNotFoundException {
        //throws ile istisna olusturuyoruz

        Car toyota = new Car("Toyota", 2021);
        Car honda = new Car("Honda", 2023);
        // Car sınıfına aıt ıkı adet obje olusturduk

        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/emrey/OneDrive/Masaüstü/IO/cars.txt");
        // ciktilari cars.txt dosyasına aktarmak FileOutputStream icin bir obje olusturyoruz

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        // objelerin ıcındekı verılerı okuyabılmek ıcın ObjectOutputStream sınıfına aıt bır obje olusturuyoruz
        // son olarak cıktı bu okudugu degeri nereye cıktı verecegını belırtıyoruz(cars.txt)


        objectOutputStream.writeObject(toyota);
        /* ObjectOutputStream sınfına aıt objectOutputStream referansı ıle ObjectOutputStream'e aıt bır
        obje olusturduk, aynısını bır sonrakı obje ıcınde yaptık(toyota)(honda) */
        objectOutputStream.writeObject(honda);

    }
}