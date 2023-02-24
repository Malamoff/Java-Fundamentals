import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        for (String currentElementFromSecondArr : arr2) {
            for (String currentElementFromFirstArr : arr1) {
                if (currentElementFromSecondArr.equals(currentElementFromFirstArr)) {
                    System.out.print(currentElementFromFirstArr + " ");
                    break;
                }
            }
        }
    }
}
