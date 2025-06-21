package Week1.DesignPatterns_and_Principles.FactoryMethod_Pattern;

public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

