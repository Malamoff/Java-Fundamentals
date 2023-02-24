import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int numberOfCourses = people / capacity;

        if (numberOfCourses % capacity != 0 || numberOfCourses==0) {
            numberOfCourses++;
        }
        System.out.println(numberOfCourses);
    }
}
