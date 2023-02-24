import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int longestSequence = 0;
        int lastIndex = 0;

        int currentSequence = 1;

        for (int i = 0; i < arr.length; i++) {

            if (i< arr.length-1 && arr[i] == arr[i + 1]) {
                currentSequence++;
                if(currentSequence> longestSequence){
                    longestSequence = currentSequence;
                    lastIndex = arr[i];
                }
            }else{
                currentSequence = 1;
            }
        }

        if(longestSequence == 0){
            longestSequence = 1;
            lastIndex = arr[0];
        }

        for (int i = 1; i <= longestSequence; i++) {
            System.out.print(lastIndex + " ");
        }

    }
}
