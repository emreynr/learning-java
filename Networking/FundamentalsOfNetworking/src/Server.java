import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket(); // baglantı kurulmus oldu
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("messeage : " + str);
            serverSocket.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }
}
/**
 *  olusabılecek bir hata ıcın try catch deneyip hatayı catch blogu altında
 *  yakalıyoruz
 */
