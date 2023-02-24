import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfWeek = Integer.parseInt(scanner.nextLine());
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if(dayOfWeek>=1 && dayOfWeek<=7){
            System.out.println(week[dayOfWeek-1]);
        }else{
            System.out.println("Invalid day!");
        }
    }
}
