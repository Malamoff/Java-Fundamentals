import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustion = Integer.parseInt(scanner.nextLine());

        int targetCounter = 0;
        int initialPower = power;

        while (power >= distance) {
            targetCounter++;
            power -= distance;

            if (power == 1.0 * initialPower / 2 && exhaustion != 0) {
                power /= exhaustion;
            }
        }
        System.out.println(power);
        System.out.println(targetCounter);
    }
}
