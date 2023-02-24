import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialLoot = scanner.nextLine().split("\\|");
        String commandData = scanner.nextLine();
        String treasureChest = String.join(", ", initialLoot);


        while (!commandData.equals("Yohoho!")) {
            String[] commandTokens = commandData.split(" ");
            switch (commandTokens[0]) {
                case "Loot":
                    treasureChest = lootItems(commandTokens, treasureChest);
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandData.split(" ")[1]);
                    treasureChest = dropItem(index, treasureChest);
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandData.split(" ")[1]);
                    treasureChest = stolenLoot(count, treasureChest);
                    break;
            }
            commandData = scanner.nextLine();
        }

        if (!treasureChest.equals("")) {
            String[] arr = treasureChest.split(", ");
            int sum = 0;
            for (String s : arr) {
                sum += s.length();
            }

            double average = 1.0 * sum / arr.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }

    private static String stolenLoot(int count, String treasureChest) {
        String stolenItems = "";

        String[] items = treasureChest.split(", ");
        if (items.length <= count) {
            for (int i = items.length - 1; i >= 0; i--) {
                if (i == items.length - 1) {
                    stolenItems = items[i] + stolenItems;
                } else {
                    stolenItems = items[i] + ", " + stolenItems ;
                }
            }
            treasureChest = "";
            System.out.println(stolenItems);
        } else {
            for (int i = items.length - 1; i > items.length - 1 - count; i--) {
                if (i == items.length - 1) {
                    stolenItems = items[i] + stolenItems;
                } else {
                    stolenItems = items[i] + ", " + stolenItems;
                }
            }
            System.out.println(stolenItems);
            String[] temp = new String[items.length - count];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = items[i];
            }
            treasureChest = String.join(", ", temp);
        }
        return treasureChest;
    }

    private static String dropItem(int index, String treasureChest) {
        String[] items = treasureChest.split(", ");

        if (index >= 0 && index <= items.length - 1) {
            String tempItem = items[index];
            for (int i = index; i < items.length; i++) {
                if (i + 1 <= items.length - 1) {
                    items[i] = items[i + 1];
                }
            }

            items[items.length - 1] = tempItem;
        }

        return String.join(", ", items);
    }

    private static String lootItems(String[] commandTokens, String treasureChest) {
        String[] tempItemArr = treasureChest.split(", ");
        String treasureChestToReturn = "";

        for (int i = 1; i < commandTokens.length; i++) {
            boolean isContained = false;
            for (String s : tempItemArr) {
                if (commandTokens[i].equals(s)) {
                    isContained = true;
                    break;
                }
            }

            if (!isContained) {
                treasureChestToReturn = commandTokens[i] + ", " + treasureChestToReturn;
            }
        }
        return treasureChestToReturn + treasureChest;
    }
}
