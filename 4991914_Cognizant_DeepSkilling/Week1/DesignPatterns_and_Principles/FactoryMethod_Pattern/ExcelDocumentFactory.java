package Week1.DesignPatterns_and_Principles.FactoryMethod_Pattern;

public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
