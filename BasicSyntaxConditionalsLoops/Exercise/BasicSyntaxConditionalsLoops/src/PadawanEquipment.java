import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input.
        double totalSum = Double.parseDouble(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        // Making calculations about the expenses for every product.
        double lightsaberExpenses = Math.ceil(numberOfStudents * 1.1) * lightsaberPrice;
        double robeExpenses = numberOfStudents * robePrice;
        double beltExpenses = (numberOfStudents - numberOfStudents / 6) * beltPrice;

        double totalExpenses = lightsaberExpenses + robeExpenses + beltExpenses;

        if(totalSum>=totalExpenses){
            System.out.printf("The money is enough - it would cost %.2flv.", totalExpenses);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", totalExpenses-totalSum);
        }
    }
}
