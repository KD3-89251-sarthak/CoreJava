import java.util.Scanner;
public class FoodMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Food menu and prices
        String[] items = {"Dosa", "Samosa", "Idli"};
        int[] prices = {50, 20, 30};
        int[] quantity = new int[3]; // Stores quantity of each item ordered

        boolean ordering = true;

        while (ordering) {
            // Display menu
            System.out.println("\n===== FOOD MENU =====");
            System.out.println("1. Dosa - ₹50");
            System.out.println("2. Samosa - ₹20");
            System.out.println("3. Idli - ₹30");
            System.out.println("10. Generate Bill");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 10) {
                ordering = false;
                break;
            }

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice! Please select a valid option.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = scanner.nextInt();
            quantity[choice - 1] += qty; // Store quantity for the selected item
        }

        // Generate bill
        System.out.println("\n===== BILL =====");
        int totalBill = 0;
        for (int i = 0; i < 3; i++) {
            if (quantity[i] > 0) {
                int itemTotal = prices[i] * quantity[i];
                totalBill += itemTotal;
                System.out.println(items[i] + " x " + quantity[i] + " = ₹" + itemTotal);
            }
        }
        System.out.println("-----------------------");
        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Thank you! Visit again.");

        scanner.close();
    }
}
