import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int numberOfOrders = Integer.parseInt(scanner.nextLine());

        // Creating variable to save the total expenses.
        double totalExpenses = 0;

        // Iterating over the orders.
        for (int i = 0; i < numberOfOrders; i++) {

            // Reading information about each order
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());

            // Calculating totalPrice and print output.
            double pricePerOrder = ((days * capsules) * pricePerCapsule);
            totalExpenses += pricePerOrder;

            System.out.printf("The price for the coffee is: $%.2f%n", pricePerOrder);
        }

        System.out.printf("Total: $%.2f", totalExpenses);
    }
}
