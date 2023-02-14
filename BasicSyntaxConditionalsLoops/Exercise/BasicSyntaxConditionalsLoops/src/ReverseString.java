import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringToBeReversed = scanner.nextLine();

        String reversedString = "";

        for (int i = stringToBeReversed.length() - 1; i >= 0; i--) {
            reversedString = reversedString + stringToBeReversed.charAt(i);
        }
        System.out.println(reversedString);
    }
}
