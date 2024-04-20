package document;

class TextDocument extends Document {
    private int totalPages;

    public TextDocument(int documentId, String documentName, int totalPages, float size) {
        super(documentId, documentName, DocumentType.IMAGE, size);
        this.totalPages = totalPages;
    }

    @Override
    public DocumentType getDocumentType() {
        return DocumentType.IMAGE;
    }

    public void display() {
        System.out.println("Document Id: " + getDocumentId() + " Document Name: " + getDocumentName() + " Total pages: "
                + totalPages + " Document Type: " + getDocumentType() + " Size: " + getSize() + "mb ");
    }
}
