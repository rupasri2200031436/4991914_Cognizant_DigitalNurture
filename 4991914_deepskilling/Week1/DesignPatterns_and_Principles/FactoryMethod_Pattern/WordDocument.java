package Week1.DesignPatterns_and_Principles.FactoryMethod_Pattern;

public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document.");
    }

    public void close() {
        System.out.println("Closing Word Document.");
    }
}

