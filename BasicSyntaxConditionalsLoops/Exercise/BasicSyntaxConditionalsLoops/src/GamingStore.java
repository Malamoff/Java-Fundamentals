import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input.
        double currentBalance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        // Creating additional variable to save each game price;
        double gamePrice = 0;
        double totalSpent = 0;
        boolean outOfMoney = false;

        // Iterating until "Game Time is reached"
        while (!command.equals("Game Time")) {
            boolean notFound = false;
            switch (command) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                default:
                    notFound = true;
                    System.out.println("Not Found");
            }

            if (notFound) {
                command = scanner.nextLine();
                continue;
            }
            if (currentBalance >= gamePrice) {
                System.out.println("Bought " + command);
                totalSpent += gamePrice;
                currentBalance -= gamePrice;
            } else {
                System.out.println("Too Expensive");
                command = scanner.nextLine();
                continue;
            }

            if (currentBalance == 0) {
                System.out.println("Out of money!");
                outOfMoney = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (!outOfMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
        }
    }
}
