import java.util.Scanner;

public class PrintASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int lowerLimit = Integer.parseInt(scanner.nextLine());
        int upperLimit = Integer.parseInt(scanner.nextLine());

        for (int i = lowerLimit; i <=upperLimit ; i++) {
            System.out.printf("%c ", i);
        }
    }
}
