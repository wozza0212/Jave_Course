import java.util.Objects;
import java.util.Scanner;

public class signIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";

        /* Task 1
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String usernameCheck = scan.nextLine();


        System.out.print("- Password: ");
        String passwordCheck = scan.nextLine();

        while (!usernameCheck.equals(username) && !Objects.equals(passwordCheck, password)) {
            System.out.println("\nThe information you provided was incorrect,\nPlease try again!\n");
            System.out.print("- Username: ");
            usernameCheck = scan.nextLine();


            System.out.print("- Password: ");
            passwordCheck = scan.nextLine();
        }

        scan.close();

    }
}

