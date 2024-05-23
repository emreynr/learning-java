import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class FileNotFound {

    public static void main(String[] args) {

        try {
            File file = new File("D://algortihms/test/test.txt");
            FileReader fr = new FileReader(file);
        }
        catch (FileNotFoundException x){
            System.out.println("file not found, pls check to directory..");
        }
    }
}
