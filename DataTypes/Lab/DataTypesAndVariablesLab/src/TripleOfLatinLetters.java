import java.util.Scanner;

public class TripleOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperLimit = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < 97 + upperLimit; i++) {
            for (int j = 97; j < 97 + upperLimit; j++) {
                for (int k = 97; k < 97 + upperLimit; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }

    }
}
