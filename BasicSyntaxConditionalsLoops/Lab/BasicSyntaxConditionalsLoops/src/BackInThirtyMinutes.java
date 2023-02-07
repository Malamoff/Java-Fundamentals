import java.util.Scanner;

public class BackInThirtyMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input data.
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        // Making not so simple calculations with really subjective logic, but it's working!
        if (minutes + 30 >= 60) {
            hours += 1;
            minutes = minutes + 30 - 60;
            if (hours > 23) {
                hours = 0;
            }
        } else {
            minutes += 30;
        }

        // Printing output.
        System.out.printf("%d:%02d", hours, minutes);
    }
}
