import java.util.Scanner;

public class ReversedArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        int middleIndex = array.length / 2;

        for (int i = 0; i < middleIndex; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (String s : array) {
            System.out.print(s + " ");
        }

    }
}
