import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the array of integers.
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // Creating 2 variables to save even/odd sum.
        int evenSum = 0;
        int oddSum = 0;

        // Iterate over the array and save value of each index in even/odd sum.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }

        // Printing difference between even and odd;
        System.out.println(evenSum - oddSum);
    }
}
