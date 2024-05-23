import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        // istisnalar icin try blogu olusturuyoruz
        try {
            // ServerSocket classı ıcın obje olusturuyoruz
            //soket baglantısı main() altında olmalı
            ServerSocket serverSocket = new ServerSocket(6666);

            // baglantıyı olusturuyoruz
            Socket socket = serverSocket.accept();

            // getInputStream() ile input stream'i cagiriyoruz
            //bu metod DataInputStream sınıfı tarafından olusturulur
            //obje olustuyoruz

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            String s = (String)dataInputStream.readUTF();

            // terminal üzerinde bu stringi yazdiriyoruz
            System.out.println("messeage: " + s);

            // son olarak soketi kapatıyoruz
            socket.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
/**
 * Socket programlama yaparlen butun metodlar main() altına değil
 * class altına yazlıyordu, ServerSocket progralamada ise butun iş
 * main() metodu altında yapılıyor
 */