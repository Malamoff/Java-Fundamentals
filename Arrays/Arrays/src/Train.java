import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Reading number of iterations.
        int numberOfWagons = Integer.parseInt(scanner.nextLine());

        // Create a new int[] to collect all passengers
        int[] train = new int[numberOfWagons];

        // Create a variable to sum all the passengers.
        int passengersCount = 0;

        for (int i = 0; i < numberOfWagons; i++) {
            int passengers = Integer.parseInt(scanner.nextLine());
            passengersCount += passengers;

            train[i] = passengers;
        }

        for (int i : train) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(passengersCount);
    }
}
