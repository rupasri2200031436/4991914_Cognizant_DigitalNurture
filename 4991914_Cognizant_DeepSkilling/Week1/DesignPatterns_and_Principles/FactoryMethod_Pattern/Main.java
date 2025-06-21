package Week1.DesignPatterns_and_Principles.FactoryMethod_Pattern;

public class Main {
    public static void main(String[] args) {
        // Word Document
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.close();

        // PDF Document
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.close();

        // Excel Document
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.close();
    }
}

