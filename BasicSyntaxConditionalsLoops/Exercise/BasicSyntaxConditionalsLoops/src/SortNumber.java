import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int temp = 0;


        if (num1 <= num2 && num1 <= num3) {
            min = num1;
            if (num2 > num3) {
                max = num2;
                temp = num3;
            } else {
                max = num3;
                temp = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
            if (num1 < num3) {
                max = num3;
                temp = num1;
            } else {
                max = num1;
                temp = num3;
            }
        } else if (num3 < num1 && num3 < num2) {
            min = num3;
            if (num1 < num2) {
                max = num2;
                temp = num1;
            } else {
                max = num1;
                temp = num2;
            }
        }

        System.out.println(max);
        System.out.println(temp);
        System.out.println(min);

    }
}
