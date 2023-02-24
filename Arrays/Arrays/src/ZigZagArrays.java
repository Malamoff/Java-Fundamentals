import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arrSize = Integer.parseInt(scanner.nextLine());

        // Creating two empty int[]
        int[] arr1 = new int[arrSize];
        int[] arr2 = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            // Reading a two-element int[]
            int[] tempArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (i % 2 == 0) {
                arr1[i] = tempArr[0];
                arr2[i] = tempArr[1];
            } else {
                arr1[i] = tempArr[1];
                arr2[i] = tempArr[0];
            }
        }

        printArr(arr1);
        printArr(arr2);
    }


    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
