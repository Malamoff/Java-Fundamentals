import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input.
        int loosesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        // Every 2nd loose breaks headset.
        double headsetExpenses = (loosesCount / 2) * headsetPrice;
        // Every 3rd loose breaks mouse.
        double mouseExpenses = (loosesCount / 3) * mousePrice;
        // Every 6th loose breaks keyboard.
        double keyboardExpenses = (loosesCount / 6) * keyboardPrice;
        // Every 12th loose breaks display.
        double displayExpenses = (loosesCount / 12) * displayPrice;


        System.out.printf("Rage expenses: %.2f lv.", headsetExpenses + mouseExpenses + keyboardExpenses + displayExpenses);


    }
}
