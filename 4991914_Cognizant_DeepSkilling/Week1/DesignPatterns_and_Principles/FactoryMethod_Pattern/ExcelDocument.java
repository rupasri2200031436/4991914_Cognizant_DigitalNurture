package Week1.DesignPatterns_and_Principles.FactoryMethod_Pattern;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document.");
    }

    public void close() {
        System.out.println("Closing Excel Document.");
    }
}
