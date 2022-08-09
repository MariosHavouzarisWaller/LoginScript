import java.util.Scanner;

public class LoginScript {

    public static void main(String[] args) {
        // Declare and initialise username and password && Set up the scanners for it
        Scanner nameScanner = new Scanner(System.in);
        Scanner passScanner = new Scanner(System.in);
        String username = "Admin";
        String password = "Password!";
        String inputUser;
        String inputPass;
        int count = 0;
        boolean validated = false;

        // Loop through whilst validated is true. Validated will become false once count reaches 3
        while (validated == false && count < 3) {

            // Take user inputs
            System.out.println("Please enter your username:");
            inputUser = nameScanner.nextLine();
            System.out.println("Please enter your password:");
            inputPass = passScanner.nextLine();

            if (inputUser.contains("Admin") && inputPass.contains("Password!")) {
                System.out.println("You have been validated!");
                validated = true;
            }
            else if ((inputUser.isEmpty() || inputPass.isEmpty()) && count < 2) {
                System.out.println("Please enter a username or password.");
            }
            else if ((inputUser.contains("") || inputPass.contains("")) && count < 2) {
                System.out.println("Access not authorised. Please try again.");
                count++;
            }
            else {
                System.out.println("You have been banned!");
                count++;
            }

        }
    }
}
