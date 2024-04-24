public class BookDTO {

    private String title;
    private String author;
    private String gener;
    private String ISBN;
    private int pageCount;
    private int price;

    private static int bookCount = 0;

    public BookDTO(String title, String author, String gener, String ISBN, int pageCount, int price) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.gener = gener;
        this.pageCount = pageCount;
        this.price = price;
        bookCount++;
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

}
