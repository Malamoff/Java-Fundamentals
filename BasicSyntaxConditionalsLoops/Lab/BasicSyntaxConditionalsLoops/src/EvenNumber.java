import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input.
        int number = Integer.parseInt(scanner.nextLine());

        // Iterating until an even number is provided.
        while (number % 2 != 0) {
            System.out.println("Please write an even number.");
            number = Integer.parseInt(scanner.nextLine());
        }

        // Printing absolute value of number
        System.out.printf("The number is: %d", Math.abs(number));
    }
}
