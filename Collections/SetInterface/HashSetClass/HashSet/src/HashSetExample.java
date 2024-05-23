import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        // HashSet ile kitap uygulamasi

        //Book classi icin objeler olusturuyoruz
        Book book1 = new Book(1, "1984", "Orwell", "say", 890);
        Book book2 = new Book(2, "falling of the grovements", "hacemoglu", "doruk", 1000);

        // olusturugumuz bi objeleri hashset olusturup icine ekleyecegiz
        HashSet<Book> hashset = new HashSet<>();

        // hashsete ekleme
        hashset.add(book1);
        hashset.add(book2);

        for (Book o : hashset) { //Booktaki her bir degeri alacagiz
            System.out.println(o.author + " " + o.quantity + " " + o.publisher + " " + o.bookId + " " + o.name);
        }
    }
}
