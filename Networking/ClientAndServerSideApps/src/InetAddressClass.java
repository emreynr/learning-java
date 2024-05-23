import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressClass {
    public static void main(String[] args) throws UnknownHostException {

            InetAddress address = InetAddress.getLocalHost();

            //LocalHostun InetAddress bilgisini al ve yazdır
            System.out.println("InetAdress of Local Host:" + address);

            // LocalHostun adını ve al ve yazdır
            String hostName = address.getHostName();

            System.out.println("hostname of the local host:" + hostName);
        }
    }

