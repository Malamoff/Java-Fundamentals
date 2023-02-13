import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input.
        String username = scanner.nextLine();

        // Creating variable to count the number of login tries and one boolean flag if it is rached.
        int loginCounter = 0;


        // Reversed username is the correct password.
        String correctPassword = passwordGet(username);

        while (loginCounter < 4) {
            String password = scanner.nextLine();

            if (password.equals(correctPassword)) {
                System.out.printf("User %s logged in.", username);
                break;
            }

            loginCounter++;

            if (loginCounter < 4) {
                System.out.println("Incorrect password. Try again.");
            }
        }

        // Max number of tries is 4, if it is reached - print output and block user
        if (loginCounter == 4) {
            System.out.printf("User %s blocked!", username);
        }

    }

    private static String passwordGet(String username) {
        String password = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            password = password + username.charAt(i);
        }
        return password;
    }
}
