import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimeter = scanner.nextLine();

        System.out.println(name+delimeter+lastName);
    }
}
