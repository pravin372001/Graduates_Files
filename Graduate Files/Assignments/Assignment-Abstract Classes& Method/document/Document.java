package document;

public abstract class Document {
    private int documentId;
    private String documentName;
    private DocumentType documentType;
    private float size;

    public Document(int documentId, String documentName, DocumentType documentType, float size) {
        this.documentId = documentId;
        this.documentName = documentName;
        this.documentType = documentType;
        this.size = size;
    }

    public int getDocumentId() {
        return documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public float getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Document [documentId=" + documentId + ", documentName=" + documentName + ", documentType="
                + documentType + ", size=" + size + "]";
    }

    public abstract DocumentType getDocumentType();

    public abstract void display();

}
