import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws Exception {

        //DataSocket uzerınden DataPacket gonderimi

        DatagramSocket datagramSocket = new DatagramSocket();
        String s ="hi java";
        InetAddress ipAddress = InetAddress.getByName("127.0.0.1");

        DatagramPacket datagramPacket = new DatagramPacket(s.getBytes(), s.length(), ipAddress, 3000);
        datagramSocket.send(datagramPacket);
        //datagramSocket.send ile datagramPacket gonderıyoruz
        datagramSocket.close();
    }
}