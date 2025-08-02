import java.util.Arrays;
import java.util.Scanner;

class Product {
    int id;
    String name;
    String category;

    // Constructor
    public Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    // displays product details
    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Category: " + category;
    }
}
public class ProductSearch{
    public static Product searchUsingLinear(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.id == targetId) {
                return p;
            }
        }
        return null;
    }
    public static Product searchUsingBinary(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (products[mid].id == targetId) {
                return products[mid];
            } else if (products[mid].id < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int count = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[count];
        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }
        // Sort products by ID for binary search
        Arrays.sort(products, (a, b) -> Integer.compare(a.id, b.id));

        // Ask for product ID to search
        System.out.print("\nEnter Product ID to search: ");
        int searchId = sc.nextInt();

        //Performing Linear Search to find the Product details using Product Id
        Product foundLinear = searchUsingLinear(products, searchId);
        if (foundLinear != null) {
            System.out.println("Found using Linear Search: " + foundLinear);
        } else {
            System.out.println("Product not found using Linear Search.");
        }

        // Performing Binary Search to find the Product details using product ID
        Product foundBinary = searchUsingBinary(products, searchId);
        if (foundBinary != null) {
            System.out.println("Found using Binary Search: " + foundBinary);
        } else {
            System.out.println("Product not found using Binary Search.");
        }
        sc.close();
    }
}
