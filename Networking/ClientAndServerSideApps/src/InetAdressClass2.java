import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressClass2 {
    public static void main(String[] args) throws UnknownHostException {

        // isimlendirilmiş hosttan InetAddress al ve yazdır
        InetAddress address1 = InetAddress.getByName("write.geekforgeeks.org");
        //ip adresini alır

        System.out.println("Inet Address of named hosts: " + address1);

        //isimlendirilmişs hosttan InetAddress bilgisini al ve yazdır
        InetAddress array[] = InetAddress.getAllByName("www.geekforgeeks.org");

        System.out.println("Inet Address of all named hosts: ");

        for (int loop = 0; loop < array.length; loop++) {
            System.out.println(array[loop]);
        }
    }
}
