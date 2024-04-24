package document;

class ImageDocument extends Document {
    private String format;

    public ImageDocument(int documentId, String documentName, String format, float size) {
        super(documentId, documentName, DocumentType.TEXT, size);
        this.format = format;
    }

    @Override
    public DocumentType getDocumentType() {
        return DocumentType.TEXT;
    }

    public void display() {
        System.out.println("Document Id :" + getDocumentId() + " Document Name :" + getDocumentName() + " Size :"
                + getSize() + "mb " + "Document Type: " + getDocumentType() + " Format :" + format);
    }

}
