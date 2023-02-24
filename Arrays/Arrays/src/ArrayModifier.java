import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String commandInstructions = scanner.nextLine();

        while (!commandInstructions.equals("end")) {
            String command = commandInstructions.split(" ")[0];
            int index1 = 0;
            int index2 = 0;

            switch (command) {
                case "swap":
                    index1 = Integer.parseInt(commandInstructions.split(" ")[1]);
                    index2 = Integer.parseInt(commandInstructions.split(" ")[2]);
                    swapPlaces(index1, index2, array);
                    break;
                case "multiply":
                    index1 = Integer.parseInt(commandInstructions.split(" ")[1]);
                    index2 = Integer.parseInt(commandInstructions.split(" ")[2]);
                    multiplication(index1, index2, array);
                    break;
                case "decrease":
                    decreaseArrayValues(array);
                    break;
            }
            commandInstructions = scanner.nextLine();
        }

        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
    }

    private static void multiplication(int index1, int index2, int[] array) {
        int temp = array[index1] * array[index2];
        array[index1] = temp;
    }

    private static void decreaseArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]--;
        }
    }

    private static void swapPlaces(int index1, int index2, int[] array) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
