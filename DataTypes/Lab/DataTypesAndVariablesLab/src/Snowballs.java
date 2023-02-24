import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());

        double bestSnowballValue = 0;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;

        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());


            double currentBallValue = Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);

            if (currentBallValue> bestSnowballValue){
                bestSnowballValue = currentBallValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestSnowballValue, bestQuality );
    }
}
