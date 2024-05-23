import javax.sound.sampled.Port;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

    // soketleri ve inputları olusturuyoruz
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;


    // port icin constructor olusturuyoruz
    public ServerSide(int port) {

        // serveri baslatıp baglantıyı beklıyoruz
        try {
            server = new ServerSocket(port);
            System.out.println("server started..");
            System.out.println("waiting for a client...");
            socket = server.accept(); // baglantıyı bu sekılde kabul ettık

            // client soketınden inputu bu sekılde aldık
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String line = "";

            // client tarafından "End" mesajı gelene kadar okumaya devam ediyoruz
            while (!line.equals("End")) {

                try {
                    line = in.readUTF();
                    System.out.println(line);
                }
                catch (IOException i) {
                    System.out.println(i);
                }
            }
            System.out.println("closing connection...");

            //closing connection
            socket.close();
            in.close();
        }
        catch (IOException i) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {

        ServerSide server = new ServerSide(5000);



    }
}
/**
 * once metodu yazdık
 *
 * tabi programı calıstırmak ıcın once Server sonra client tarafı calıstrılmalı
 */