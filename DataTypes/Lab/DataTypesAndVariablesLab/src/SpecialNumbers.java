import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            boolean isSpecial = checkIfSpecial(i);
            if(isSpecial){
                System.out.println(i + " -> True");
            }else {
                System.out.println(i + " -> False");
            }
        }
    }

    private static boolean checkIfSpecial(int i) {
        int sum = 0;

        while (i > 0) {
            sum += i % 10;
            i = i / 10;
        }

        if (sum == 5 || sum == 7 || sum == 11) {
            return true;
        }

        return false;
    }
}
