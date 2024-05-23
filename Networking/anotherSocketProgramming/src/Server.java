import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    //soket ve input streamların tanımlanması
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream input = null;

    //portlarla bırlıkle contructor olusturma
    public Server(int port) {

        // baglantı ıcın serveri baslat ve bekle
        try {
            server = new ServerSocket(port);
            System.out.println("Server Started.");

            System.out.println("Waiting a Client...");

            socket = server.accept();
            System.out.println("Server Created.");

            //client soketinden input al
            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String s = "";

            //"End yazılmadıgı surece donguyu tekrar ettır
            while(!s.equals("End")) {

                try {
                    s = input.readUTF();
                    System.out.println(s);
                }
                catch (IOException i) {
                    System.out.println(i);
                    // olusabılecek IO istisnasını catch ile yakalıyoruz
                }
            }
            System.out.println("Closing Connection..");

            // close connection
            socket.close();
            input.close();

        }
        catch (IOException i) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        Server server = new Server(5000);

    }
}
