import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loopLimit = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= loopLimit; i++) {
            int sum = 0;
            int temp = i;

            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }

    }
}
