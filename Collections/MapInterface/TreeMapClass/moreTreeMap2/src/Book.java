public class Book {

    public int bookId;
    public int bookQuantity;
    public String bookName;
    public String bookAuthor;
    public String bookPublisher;

    //constructor
    public Book(int bookId, int bookQuantity, String bookName, String bookAuthor, String bookPublisher) {
        this.bookId = bookId;
        this.bookQuantity = bookQuantity;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
    }
    // sımdı maın() altındakı degerlerı kullanacagız
}
