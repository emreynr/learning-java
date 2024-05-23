import java.net.MalformedURLException;
import java.net.URL;

public class URLclass2 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://write.geeksforgeeks.org/post/3038131");

        //URL nın protokolunu al ve yazdır
        String protocol = url.getProtocol();
        System.out.println("Protocol:" + protocol);

        //URL nın hostName ini al ve yazdır
        String host = url.getHost();
        System.out.println("HostName: " + host);

        //URL nin dosyaadini al ve yazdır
        String fileName = url.getFile();
        System.out.println("File name:" + fileName);

        //URL nin default portunu al ve yazdır
        int defaultPort = url.getDefaultPort();
        System.out.println("default Port: " + defaultPort);

        // ve bunlar gibi daha birsuru komut var fakat yeri geldikce kullanmak daha yerinde olur
    }
}
