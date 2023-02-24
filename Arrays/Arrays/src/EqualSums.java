import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean areEqual = false;


        for (int i = 0; i < arr.length; i++) {

            int leftSum = findSum(i, "left", arr);
            int rightSum = findSum(i, "right", arr);

            if (leftSum == rightSum) {
                areEqual = true;
                System.out.println(i);
                break;
            }
        }

        if (!areEqual) {
            System.out.println("no");
        }

    }



    private static int findSum(int index, String direction, int[] array) {
        int sum = 0;

        if (index == 0 && direction.equals("left")) {
            return 0;
        } else if (direction.equals("left")) {
            for (int i = 0; i < index; i++) {
                sum += array[i];
            }
        }

        if (index == array.length - 1 && direction.equals("right")) {
            return 0;
        } else if (direction.equals("right")) {
            for (int i = index+1; i < array.length; i++) {
                sum += array[i];
            }
        }
        return sum;
    }
}
