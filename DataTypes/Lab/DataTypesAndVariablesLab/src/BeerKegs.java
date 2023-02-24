import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());

        String biggestKeg = "";
        double biggestKegVolume = 0;

        for (int i = 0; i < numberOfKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > biggestKegVolume) {
                biggestKeg = model;
                biggestKegVolume = volume;
            }
        }

        System.out.println(biggestKeg);

    }
}
