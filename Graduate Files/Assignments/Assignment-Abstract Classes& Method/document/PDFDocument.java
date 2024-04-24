package document;

public class PDFDocument extends Document {
    private int totalLines;

    public PDFDocument(int documentId, String documentName, int totalLines, float size) {
        super(documentId, documentName, DocumentType.PDF, size);
        this.totalLines = totalLines;
    }

    public DocumentType getDocumentType() {
        return DocumentType.PDF;
    }

    public void display() {
        System.out.println("Document Id:" + getDocumentId() + " Document Name:" + getDocumentName() + " Size:"
                + getSize() + "mb " + "Document Type :" + getDocumentType() + " Total Lines:" + totalLines);
    }
}
