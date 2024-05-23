import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSide {

    //oncelıklı olarak soket ve giris cikis streamları olusturuyoruz
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    public ClientSide (String address, int port) {
        //objeleri kullanabılmek icin constructor olusturuyoruz

        // baglantıyı kurmay baslıyoruz
        try {
            socket = new Socket(address, port);
            System.out.println("connected.");

            // terminal uzerınden input alıyoruz
            input = new DataInputStream(System.in);

            // cıktıyı sokete gonderiyoruz
            out = new DataOutputStream(socket.getOutputStream());
        }
        catch (UnknownHostException e) {
            // olusabılecek ıstısnayı bu sekılde yakalıyoruz
            System.out.println(e);

        }
        catch (IOException i) {
            System.out.println(i);
        }

        // inputtan gelen stringi oku
        String line = "";


        // burada while ile gelen baglantıları End yazılana kadar okuyoruz
        while (!line.equals("End")) {
            try {
                line = input.readLine();
                out.writeUTF(line);
            }
            catch (IOException i) {
                System.out.println(i);
            }

            // baglantıyı kapatıyoruz
            try {
                input.close();
                out.close();
                socket.close();
            }
            catch (IOException i) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        ClientSide client = new ClientSide("127.0.0.1", 5000);
    }
}
