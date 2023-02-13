import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input.
        String input = scanner.nextLine();
        double totalMoney = 0;

        // Reading coin values, print message if the coin is not supported, add each coin to totalMoney.
        while (!input.equals("Start")) {
            double currentCoin = Double.parseDouble(input);

            if (currentCoin == 0.1 ||
                    currentCoin == 0.2 ||
                    currentCoin == 0.5 ||
                    currentCoin == 1 ||
                    currentCoin == 2) {
                totalMoney += currentCoin;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoin);
            }
            input = scanner.nextLine();
        }

        // Reading input for products
        String product = scanner.nextLine();

        // Iterating until "End" is presented
        while (!product.equals("End")) {
            // Creating variable for product price if it exists.
            double price = 0;
            boolean isValidProduct = true;
            switch (product) {
                case "Nuts":
                    price = 2;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    isValidProduct = false;
                    break;
            }

            // Checking if totalMoney is enough to buy current product, print output.
            if (totalMoney >= price && isValidProduct) {
                System.out.println("Purchased " + product);
                totalMoney -= price;
            } else if(totalMoney <= price && isValidProduct) {
                System.out.println("Sorry, not enough money");
            }

            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalMoney);
    }
}
