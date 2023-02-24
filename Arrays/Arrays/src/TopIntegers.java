import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            boolean isTopInteger = true;

            for (int j = i + 1; j < array.length; j++) {
                if (temp <= array[j]) {
                    isTopInteger = false;
                    break;
                }
            }

            if(isTopInteger){
                System.out.print(temp + " ");
            }
        }
    }
}
