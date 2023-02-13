import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int number = Integer.parseInt(scanner.nextLine());

        // Creating a temporary variable to make manipulations to it.
        int temp = number;
        // Creating var to sum all factorials.
        int total = 0;

        // Iterating until the temp = 0;
        while (temp > 0) {
            int currentNum = temp % 10;
            total += factorial(currentNum);
            temp = temp / 10;
        }

        // Printing output
        if(total == number){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }

    // Method to calculate Factorial.
    private static int factorial(int currentNum) {
        int factorial = 1;

        if (currentNum == 0) {
            return 1;
        }

        for (int i = 1; i <= currentNum; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
