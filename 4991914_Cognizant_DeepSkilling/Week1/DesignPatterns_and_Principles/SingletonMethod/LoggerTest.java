package Week1.DesignPatterns_and_Principles.SingletonMethod;

public class LoggerTest {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        if (log1 == log2) {
            System.out.println("Both references point to the same Logger instance.\n");
        }

        log1.log("Starting the application.");
        log2.log("Application is running smoothly.");
    }
}
