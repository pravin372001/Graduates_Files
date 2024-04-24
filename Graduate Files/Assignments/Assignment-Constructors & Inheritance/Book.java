import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private String gener;
    private String ISBN;
    private int pageCount;
    private int price;

    private static int bookCount = 0;

    public Book(String title, String author, String gener, String ISBN, int pageCount, int price) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.gener = gener;
        this.pageCount = pageCount;
        this.price = price;
        bookCount++;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", gener=" + gener + ", ISBN=" + ISBN + ", pageCount="
                + pageCount + ", price=" + price + "]";
    }

    public void display(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("pravin", "Jothi", "Comedy", "ISBN1", 100, 100));
        books.add(new Book("jo", "Jai", "Emotional", "ISBN2", 200, 200));
        books.add(new Book("ameen", "Sudha", "Motivational", "ISBN3", 300, 300));
        new Book().display(books);
    }

}
