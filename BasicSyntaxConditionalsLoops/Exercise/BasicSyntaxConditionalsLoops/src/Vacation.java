import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input.
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String day = scanner.nextLine();

        // Creating a variable to save the total price and price per day for every person.
        double totalPrice = 0;
        double pricePerPerson = 0;

        // Calculating total price based on type of people, and day, adding discount if certain conditions are met.
        switch (typeOfPeople) {
            case "Students":
                switch (day) {
                    case "Friday":
                        pricePerPerson = 8.45;
                        break;
                    case "Saturday":
                        pricePerPerson = 9.80;
                        break;
                    case "Sunday":
                        pricePerPerson = 10.46;
                        break;
                }
                totalPrice = numberOfPeople * pricePerPerson;
                // Adding discount.
                if (numberOfPeople >= 30) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        pricePerPerson = 15;
                        break;
                    case "Saturday":
                        pricePerPerson = 20;
                        break;
                    case "Sunday":
                        pricePerPerson = 22.50;
                        break;
                }
                totalPrice = numberOfPeople * pricePerPerson;
                // Adding discount.
                if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                    totalPrice = totalPrice * 0.95;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        pricePerPerson = 10.90;
                        break;
                    case "Saturday":
                        pricePerPerson = 15.60;
                        break;
                    case "Sunday":
                        pricePerPerson = 16;
                        break;
                }

                // Adding discount.
                if (numberOfPeople >= 100) {
                    totalPrice = (numberOfPeople - 10) * pricePerPerson;
                } else {
                    totalPrice = numberOfPeople * pricePerPerson;
                }
                break;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
