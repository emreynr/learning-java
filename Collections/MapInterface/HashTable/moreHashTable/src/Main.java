import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
// https://www.geeksforgeeks.org/hashtable-in-java/
public class Main {

    public static void main(String[] args) {

        // basıt bır kıtap uygulaması

        Map<Integer, Book> map = new Hashtable<Integer, Book>();

        // Book classınadan obje olusturma
        Book b1 = new Book(12, "testname", "testauthor", "testPublisher");
        Book b2 = new Book(21, "testname1", "testAuthor1", "testPublisher1");

        // hashtable ıcın element ekleme
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b2);

        // map uzerınde gezınme
        for (Map.Entry<Integer, Book> object : map.entrySet()) {
            // bu sefer key ve value degerlerı ıcın ayrı ayrı degıskenlerı kullanacagız

            int key = object.getKey();
            Book book = object.getValue();
            System.out.println(key + " details : ");
            System.out.println(" book id : " + book.bookId + " book name : " + book.bookName + " book author : " + book.bookAuthor + " book publisher : " + book.bookPublisher);
        }
    }
}