import java.util.ArrayList;
import java.util.List;

class Books {
    private String bookName;
    private int bookId;
    private String authorName;
    private int bookPrice;
    private int bookCount;
    private String bookPublisher;

    public Books(String bookName, int bookId, String authorName, int bookPrice, int bookCount, String bookPublisher) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.authorName = authorName;
        this.bookPrice = bookPrice;
        this.bookCount = bookCount;
        this.bookPublisher = bookPublisher;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public int getBookCount() {
        return bookCount;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                ", bookId=" + bookId +
                ", authorName='" + authorName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookCount=" + bookCount +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }
}

public class ManageBook {
    public static void main(String[] args) {
        ArrayList<Books> booksList = new ArrayList<>();

        addBook(booksList, "The Great Gatsby", 1, "F. Scott Fitzgerald", 20, 100, "Publisher A");
        addBook(booksList, "To Kill a Mockingbird", 2, "Harper Lee", 25, 150, "Publisher B");
        addBook(booksList, "1984", 3, "George Orwell", 18, 200, "Publisher C");

        // Displaying all books in the ArrayList
        System.out.println("All books:");
        displayBooks(booksList);

        // Update a book
        updateBook(booksList, 2, "New Title", "New Author", 30, 200, "New Publisher");
        System.out.println("\nAfter updating book with ID 2:");
        displayBooks(booksList);

        // Delete a book
        deleteBook(booksList, 1);
        System.out.println("\nAfter deleting book with ID 1:");
        displayBooks(booksList);
    }

    // Method to add a book to the ArrayList
    public static void addBook(List<Books> booksList, String bookName, int bookId, String authorName, int bookPrice,
            int bookCount, String bookPublisher) {
        Books book = new Books(bookName, bookId, authorName, bookPrice, bookCount, bookPublisher);
        booksList.add(book);
    }

    // Method to update a book in the ArrayList
    public static void updateBook(List<Books> booksList, int bookId, String newTitle, String newAuthor, int newPrice,
            int newCount, String newPublisher) {
        for (Books book : booksList) {
            if (book.getBookId() == bookId) {
                book.setBookName(newTitle);
                book.setAuthorName(newAuthor);
                book.setBookPrice(newPrice);
                book.setBookCount(newCount);
                book.setBookPublisher(newPublisher);
                break; 
            }
        }
    }

    // Method to delete a book from the ArrayList
    public static void deleteBook(List<Books> booksList, int bookId) {
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getBookId() == bookId) {
                booksList.remove(i);
                break; 
            }
        }
    }

    // Method to display all books in the ArrayList
    public static void displayBooks(List<Books> booksList) {
        for (Books book : booksList) {
            System.out.println(book);
        }
    }
}
