package Week1.DesignPatterns_and_Principles.SingletonMethod;

public class Logger {
    // Single instance of Logger (lazy initialization)
    private static Logger singleInstance = null;

    // Private constructor to restrict instantiation
    private Logger() {
        System.out.println("Logger created!");
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
