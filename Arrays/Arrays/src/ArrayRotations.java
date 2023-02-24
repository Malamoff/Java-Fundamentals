import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numberOfRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfRotations; i++) {
            rotateArray(arr);
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    private static void rotateArray(int[] arr) {
        int firstElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = firstElement;
    }
}
