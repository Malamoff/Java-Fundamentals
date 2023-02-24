import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input.
        int countOfNumbers = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);


        for (int i = 0; i < countOfNumbers; i++) {
            BigDecimal currentNum = new BigDecimal(scanner.nextLine());
            sum = sum.add(currentNum);
        }

        System.out.println(sum);
    }
}
