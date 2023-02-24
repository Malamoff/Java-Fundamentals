import java.util.Scanner;

public class WaterTankCapacity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tankCapacity = 255;
        int iterations = Integer.parseInt(scanner.nextLine());
        int litersInTank = 0;

        for (int i = 0; i < iterations; i++) {
            int liters = Integer.parseInt(scanner.nextLine());

            if(tankCapacity>=liters){
                litersInTank+=liters;
                tankCapacity-=liters;
            }else{
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(litersInTank);
    }
}
