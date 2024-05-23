import java.net.URL;

public class Main {
    public static void main(String[] args) {
        /** en sık kullanılan url classları bile cok fazla o yuzden
         * tek tek yazmanın anlamı yok kullandıkca gorecegım
         */
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            System.out.println("protocol: " + url.getProtocol());
            System.out.println("host name: " + url.getHost());
            System.out.println("file name: " + url.getFile());
        }
        catch (Exception e) {
            System.out.println(e);
        }
        /*
        cıktı olarak sırasıyla protocol host ve file bastırır
         */
    }
}