import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading 2 arrays of integers.
        int[] array1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] array2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxIndex = Math.max(array1.length, array2.length);
        int sumOfArr = 0;
        boolean areIdentical = true;

        for (int i = 0; i < maxIndex; i++) {
            int firstArrCurrent = array1[i];
            int secondArrCurrent = array2[i];

            if (firstArrCurrent != secondArrCurrent) {
                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                areIdentical = false;
                break;
            }
            sumOfArr += array1[i];
        }

        if (areIdentical) {
            System.out.println("Arrays are identical. Sum: " + sumOfArr);
        }

    }
}
