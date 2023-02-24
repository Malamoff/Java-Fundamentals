import java.util.Scanner;

public class SpicesMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialSpice = Integer.parseInt(scanner.nextLine());

        int daysOfHarvest = 0;
        int totalHarvested = 0;

        while (initialSpice >= 100) {
            daysOfHarvest++;
            totalHarvested += initialSpice - 26;
            initialSpice -= 10;
        }

        if (totalHarvested >= 26) {
            totalHarvested -= 26;
        }

        System.out.println(daysOfHarvest);
        System.out.println(totalHarvested);
    }
}
