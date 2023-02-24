import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfChars = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;

        for (int i = 0; i < numberOfChars; i++) {
            char ch = scanner.nextLine().charAt(0);
            totalSum+=ch;
        }

        System.out.println("The sum equals: " + totalSum);
    }
}
