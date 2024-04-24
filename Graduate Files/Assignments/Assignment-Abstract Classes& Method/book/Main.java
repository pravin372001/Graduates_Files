package book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "James Gosling", 2000);

        book.updateBookDetails("Python Programming", "Guido van Rossum", 3500);

        book.login("admin", "password");
        book.updateBookDetails("Python Programming", "Guido van Rossum", 3000);

        // Logging out
        book.logout();

        book.updateBookDetails("C++ Programming", "Bjarne Stroustrup", 1500);
    }
}
