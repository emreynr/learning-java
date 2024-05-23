import javax.imageio.ImageIO;
import java.awt.*;
import java.net.URL;

public class downloadTesting {
    public static void main(String[] args) {

        try (URL url = new URL("https://static.javatpoint.com/core/images/socket-programming.png")) {
            Image image = ImageIO.read(url);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
