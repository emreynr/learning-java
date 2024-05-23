import java.net.URL;

public class HttpURLconnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            HttpURLconnection httpURLconnection = (HttpURLconnection)url.openConnection();
            for (int i =1; i <=8; i++) {
                System.out.println(httpURLconnection.getHeaderFieldKey(i))
            }
        }
    }
}
