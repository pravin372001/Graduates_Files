
import java.util.List;

class User {
    private String Name;
    private int id;

    public void verify() {

    }

    public void checkAccount() {

    }

    public List<Book> getBookInfo() {
        return null;

    }

}

class Staff extends User {
    private String dept;
    private Account account;
}

class SchoolStudent extends User {
    private String standard;
    private Account account;
}

class Account {
    int no_Borrowed_Books;
    int no_reserved_Books;
    int no_returned_Books;
    int no_lost_Books;
    double fine_Amount;

    public void calculateFine() {

    }

}

class LibraryBook {
    private String title;
    private String author;
    private String ISBN;
    private String publication;

    public void showdueDt() {

    }

    public void reservationStatus() {
    }

    public void feedBack() {
    }

    public void bookRequest() {
    }

    public void rnewInfo() {
    }

}

class Librarian {
    private String name;
    private int id;
    private String password;
    private String searchString;

    public void verifyLibrarian() {

    }

    public void search() {

    }

}

class libraryDatabase {
    private List<LibraryBook> List_of_books;

    public void add(LibraryBook book) {

    }

    public void delete(int id) {

    }

    public void update(int id, int count) {

    }

    public void display() {

    }

    public Book search(int bookId) {
        return null;
    }
}

class LibraryManagement {
    private User user;
    private Librarian librarian;

    public void login() {
    }

    public void register() {
    }

    public void logout() {

    }
}
