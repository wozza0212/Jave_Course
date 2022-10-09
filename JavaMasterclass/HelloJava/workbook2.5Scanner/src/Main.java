import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        System.out.println("What is your first name?");
        counter++;
        String firstName = scan.nextLine();
        System.out.println("What is your last name?");
        counter++;
        String lastName = scan.nextLine();
        System.out.println("How old are you?");
        counter++;
        int age = scan.nextInt();
        System.out.println("What would you like your username to be??");
        counter++;
        String username = scan.nextLine();
        scan.nextLine();
        System.out.println("What city do you live in?");
        counter++;
        String city = scan.nextLine();
        System.out.println("And what country is that in??");
        counter++;
        String country = scan.nextLine();
        System.out.println("Thank you for joining JavaGram!");

        System.out.println("Your information " +
                "\n\tFirst Name: " + firstName +
                "\n\tLast Name: " + lastName +
                "\n\tAge " + age +
                "\n\tUsername: " + username +
                "\n\tCity: " + city +
                "\n\tCountry: " + country +
                "\n\tQuestions answered: " + counter);
    }
}