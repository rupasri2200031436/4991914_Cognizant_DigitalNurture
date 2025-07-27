package Week1.DesignPatterns_and_Principles.FactoryMethod_Pattern;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document.");
    }

    public void close() {
        System.out.println("Closing PDF Document.");
    }
}
