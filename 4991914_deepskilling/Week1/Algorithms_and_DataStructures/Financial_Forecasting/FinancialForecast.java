import java.util.Scanner;
public class FinancialForecast {

    // Recursive method to calculate future value using the past data
    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return calculateFutureValue(principal, rate, years - 1) * (1 + rate);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Financial Forecast Using Recursion Method");

        System.out.print("Enter the initial amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the annual growth rate (e.g., 0.05 for 5%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();

        double futureValue = calculateFutureValue(principal, rate, years);

        System.out.printf("Future Value after %d years: $%.2f%n", years, futureValue);

        sc.close();
    }
}
