public class Book {

    public int bookId;
    public String name;
    public String author;
    public String publisher;
    public int quantity;

    // elementleri tum class icin gecerli hale getirmek icin
    // constructor yaziyoruz
    public Book(int id, String Name, String Author, String Publisher, int Quantity) {
        this.bookId = id;
        this.name = Name;
        this.author = Author;
        this.publisher = Publisher;
        this.quantity = Quantity;
    }

    // artik bu classtan obje referansi olusturabiliriz

}
