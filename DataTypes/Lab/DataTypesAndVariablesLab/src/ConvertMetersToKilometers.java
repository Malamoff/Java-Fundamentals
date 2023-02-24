import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading integer meters to convert.
        int meters = Integer.parseInt(scanner.nextLine());

        // Convert to Km.
        double kilometers = (1.0 * meters) / 1000;

        // Print output.
        System.out.printf("%.2f", kilometers);
    }
}
