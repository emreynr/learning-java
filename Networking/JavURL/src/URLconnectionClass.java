import java.io.InputStream;
import java.lang.reflect.Executable;
import java.net.URL;
import java.net.URLConnection;

public class URLconnectionClass {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javapoint.com/java-tutorial");
            URLConnection urlConnection = url.openConnection();
            InputStream stream = urlConnection.getInputStream();
            int loop;
            while ((loop = stream.read())! = -1) {
                System.out.println((char)loop);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
