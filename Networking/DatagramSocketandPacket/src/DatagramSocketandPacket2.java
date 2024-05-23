import javax.xml.crypto.Data;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramSocketandPacket2 {
    public static void main(String[] args) throws Exception {

        DatagramSocket datagramSocket = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, 1024);
        datagramSocket.receive(datagramPacket);

        String s = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
        System.out.println(s);
        datagramSocket.close();
    }
}
