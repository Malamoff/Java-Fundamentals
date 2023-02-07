import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToBeMultiplied = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier > 10) {
            System.out.printf("%d X %d = %d", numberToBeMultiplied, multiplier, numberToBeMultiplied * multiplier);
        } else {
            for (int i = multiplier; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", numberToBeMultiplied, i, numberToBeMultiplied * i);
            }
        }
    }
}
