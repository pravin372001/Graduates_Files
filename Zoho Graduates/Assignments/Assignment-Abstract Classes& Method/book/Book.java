package book;

class Book {
    private String title;
    private String author;
    private double price;
    private boolean loggedIn;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void updateBookDetails(String title, String author, double price) {
        if (isLoggedIn()) {
            this.title = title;
            this.author = author;
            this.price = price;
            System.out.println("Book details updated successfully.");
        } else {
            System.out.println("Unauthorized access. Please login to update book details.");
        }
    }

    public void login(String username, String password) {
        if (username.equals("admin") && password.equals("password")) {
            loggedIn = true;
            System.out.println("Login successful.");
        } else {
            loggedIn = false;
            System.out.println("Login failed. Incorrect username or password.");
        }
    }

    public void logout() {
        loggedIn = false;
        System.out.println("Logged out successfully.");
    }

    private boolean isLoggedIn() {
        return loggedIn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
