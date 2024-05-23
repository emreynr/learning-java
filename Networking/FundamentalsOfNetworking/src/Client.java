import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            dout.writeUTF("hi server");
            dout.flush();
            dout.close();
            socket.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
