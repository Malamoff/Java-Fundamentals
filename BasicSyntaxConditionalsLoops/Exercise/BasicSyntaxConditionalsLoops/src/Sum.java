import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input.
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        // Creating variable to save the total sum.
        int totalSum = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print(i + " ");
            totalSum += i;
        }

        System.out.println();
        System.out.println("Sum: " + totalSum);
    }
}
