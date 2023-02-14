import java.util.Scanner;

public class NameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int number = Integer.parseInt(scanner.nextLine());

        // Finding last digit and print its english representation;
        int lastDigit = number % 10;
        String englishRepresentation = "";

        switch (lastDigit) {
            case 0:
                englishRepresentation = "zero";
                break;
            case 1:
                englishRepresentation = "one";
                break;
            case 2:
                englishRepresentation = "two";
                break;
            case 3:
                englishRepresentation = "three";
                break;
            case 4:
                englishRepresentation = "four";
                break;
            case 5:
                englishRepresentation = "five";
                break;
            case 6:
                englishRepresentation = "six";
                break;
            case 7:
                englishRepresentation = "seven";
                break;
            case 8:
                englishRepresentation = "eight";
                break;
            case 9:
                englishRepresentation = "nine";
                break;
        }
        System.out.println(englishRepresentation);
    }
}
