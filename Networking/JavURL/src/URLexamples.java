import java.net.URL;

public class URLexamples {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/search?q=testquery&oq=testquery&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDY0NDBqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");
            System.out.println("protocol:" + url.getProtocol());
            System.out.println("host name:" + url.getHost());
            System.out.println("port number: " + url.getPort());
            System.out.println("default port number:" + url.getDefaultPort());
            System.out.println("query string: " + url.getQuery());
            System.out.println("path: " + url.getPath());
            System.out.println("file: " + url.getFile());
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
