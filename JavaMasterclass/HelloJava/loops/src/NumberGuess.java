import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {

        Random rand = new Random();
        int upperbound = 10;
        int secret = rand.nextInt(upperbound);
       /* Task 1
            1. Store a "secret" number between 1 and 5.
            2. Then, prompt the user to enter a guess.
       */
        System.out.print("I chose a number between 1 and 10. Try to guess it: ");
        Scanner scan = new Scanner(System.in);
        int playerGuess = scan.nextInt();
        scan.nextLine();

        while (playerGuess != secret) {
            System.out.print("Thats the wrong number, guess again!");
            playerGuess = scan.nextInt();
            scan.nextLine();
        }

        System.out.println("Congratilation, you got it right, the number was " + secret);


        /* Task 2
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '

            2. Once they guess it, print: You got it!
        */
        scan.close();
    }

}
