import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    //soket ve giris/cıkıs streamleri olusturuyoruz
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    // contructor olusturuyoruz
    public Client(String address, int port) {

        // baglantının baslatılması
        try {
            socket = new Socket(address,port);
            System.out.println("Connected.");

            // terminalden input alma
            input = new DataInputStream(System.in);

            // alınan bu inputu, out soketine gonderme
            out = new DataOutputStream(socket.getOutputStream());
        }
        catch (UnknownHostException u) {
            System.out.println(u);
        }
        catch (IOException i) {
            System.out.println(i);
        }

        //inputtan string bir deger alma
        String s = "";

        // "Over" yazılana dek donguyu devam ettır
        while(!s.equals("Over")) {
            try {
                s = input.readLine(); // olusabılecek bır okuma hatası ıcın catch yazacagız
                out.writeUTF(s);
            }
            catch (IOException i) {
                System.out.println(i);
                //I/O ıcın olusabılecek istisna icin catch yazdık
            }
        }

        // baglantının kapatılması
        try {
            input.close();
            out.close();
            socket.close();
        }
        catch (IOException i) {
            System.out.println(i);
            // yine bir IO istisnası ıcın catch hazırladık
        }
    }





    public static void main(String[] args) {

        Client client = new Client("127.0.0.1", 5000);

    }
}
