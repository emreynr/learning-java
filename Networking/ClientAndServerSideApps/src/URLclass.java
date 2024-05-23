import java.net.MalformedURLException;
import java.net.URL;

public class URLclass {
    public static void main(String[] args) throws MalformedURLException {

        // string bicimde bir url olusturulur
        URL url;
        url = new URL("https://write.geeksforgeeks.org/post/3038131");

        //url icin string bicimdeki degeri yazdır
        String s = url.toString();

        System.out.println("URL: " + s);
    }
}
