package document;

public class Main {
    public static void main(String[] args) {

        PDFDocument pdfDocument = new PDFDocument(1, "notes.pdf", 50, 5.5f);
        Document textDocument = new ImageDocument(1, "javaNotes.txt", "jpeg", 9.5f);
        Document imageDocument = new TextDocument(1, "java.jpg", 50, 1.5f);
        pdfDocument.display();
        textDocument.display();
        imageDocument.display();
    }

}
