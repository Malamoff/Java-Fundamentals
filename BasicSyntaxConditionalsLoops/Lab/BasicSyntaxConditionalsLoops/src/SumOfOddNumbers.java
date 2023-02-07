import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int loopLimit = Integer.parseInt(scanner.nextLine());

        // Initialize a variable to save the sum of odd numbers.
        int sumOfOdd = 0;



        // Iterating until the limit is reached, check if number is odd, if yes add it to the sum.
        for (int i = 1; i <= loopLimit; i++) {
            int oddNumber = i * 2 -1;
            sumOfOdd+=oddNumber;
            System.out.println(oddNumber);
        }
        // Printing output.
        System.out.println("Sum: " + sumOfOdd);
    }
}
