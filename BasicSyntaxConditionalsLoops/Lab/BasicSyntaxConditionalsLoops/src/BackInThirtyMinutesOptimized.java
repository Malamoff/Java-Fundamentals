import java.util.Scanner;

public class BackInThirtyMinutesOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input data.
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        // Making simple calculations.
        int timeInMinutesWithAddedTime = hours * 60 + minutes + 30;
        int hoursAfterCalc = timeInMinutesWithAddedTime / 60;
        int minutesAfterCalc = timeInMinutesWithAddedTime % 60;

        if(hoursAfterCalc>23){
            hoursAfterCalc = 0;
        }

        // Printing output.
        System.out.printf("%d:%02d", hoursAfterCalc, minutesAfterCalc);
    }
}
