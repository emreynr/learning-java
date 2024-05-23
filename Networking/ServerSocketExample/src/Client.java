import javax.xml.crypto.Data;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        // istisnaları kontrol etmek icin try blogu yazıyoruz
        try {
            Socket socket = new Socket("localhost", 6666);

            //Socket Class objesı olusturup soketi hazır duruma getiriyoruz
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            // goruntulenecek olan mesaj
            dataOutputStream.writeUTF("yo wassup nigga!");

            // dahilli bellegi temizleyip daha optımıze hale getiriyoruz
            dataOutputStream.flush();

            // soketi kapatıyoruz
            socket.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
/**
 * sonuc olarak;
 *  ServerSocket programlamada da once serveri sonra clienti baslattık
 *  serveri baslattıktan sonra beklemeye gecti ve clientten mesaj bekledi
 *  clienti baslattıgımızda server tarafında belirlemiş oldugumuz mesaj belirdi
 *
 *  --------------------------------------------------------------
 *
 *  Socket ile ServerSocket arasındakı farklar:
 *      Socket classı, server ve client arasında iletisimi kurmak icin kullanılır.
 *      bu class sayesınde mesaj okuyup yazabiliriz
 *
 *      ServerSocket classı, ServerSocket sınıfının accept() metodu, client servere
 *      baglanana kadar komut terminal kullanımını engeller. client basarılı bir sekilde server'a
 *      baglandıktan sonra server tarafında Socket'i return eder.
 *   bununla ilgili bir fotograf bu src dosyası ıcınde var
 *
 */