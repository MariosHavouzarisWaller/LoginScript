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
        while (!validated && count < 3) {

            // Take user inputs
            System.out.println("Please enter your username:");
            inputUser = nameScanner.nextLine();
            System.out.println("Please enter your password:");
            inputPass = passScanner.nextLine();

            // Check to see if the inputs are the correct ones (Admin and Password!)
            if (inputUser.contains(username) && inputPass.contains(password)) {
                System.out.println("You have been validated!");
                validated = true;   // This breaks the loop
            }
            // Checks to see if anything has been entered into the username or password field without triggering anything that would cause the loop to break
            else if ((inputUser.isEmpty() || inputPass.isEmpty()) && count < 2) {
                System.out.println("Please enter a username or password.");
            }
            // Checks to see if the inputs are anything other than the correct ones (Admin and Password!)
            else if ((inputUser.contains("") || inputPass.contains("")) && count < 2) {
                System.out.println("Access not authorised. Please try again.");
                count++;    // If count iterates to 2 then this else...if will not be run
            }
            // Runs when count = 2 and the inputs are still wrong
            else {
                System.out.println("You have been banned!");
                count++;    // + 1 to count to break the loop
            }

        }
    }
}
