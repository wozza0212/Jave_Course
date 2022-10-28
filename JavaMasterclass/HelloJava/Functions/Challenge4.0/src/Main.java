import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        //Task 1: See if the user wants to play.
        String isPlaying = scan.nextLine();


        if (isPlaying.equals("yes")) {
            System.out.println("Great");
            System.out.println("Rock - Paper - Scissors, shoot");
            String usersChoice = scan.nextLine();
            String CompPick = computerChoice();
            String Result = result(usersChoice, CompPick);
            System.out.println(Result);
            printResult(usersChoice, CompPick, Result);


        }


        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     *
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        String pick = "";
        Random rand = new Random();
        int computerPick = rand.nextInt(3);
        switch (computerPick) {
            case 0:
                pick = "rock";
                break;
            case 1:
                pick = "paper";
                break;
            case 2:
                pick = "scissors";
                break;
        }
        return pick;
    }
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals(computerChoice)) {
            result = "Its a tie!";
        } else if ((yourChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (yourChoice.equals("paper") && computerChoice.equals("scissors")) ||
                (yourChoice.equals("scissors") && computerChoice.equals("paper"))) {
            result = "Congratulations, You win";
        } else if ((computerChoice.equals("rock") && yourChoice.equals("scissors")) ||
                (computerChoice.equals("paper") && yourChoice.equals("rock")) ||
                (computerChoice.equals("scissors") && yourChoice.equals("paper"))) {
            result = "Unlucky, it looks like you lose!";
        } else {
            result = "I dont know what's happened here!" + computerChoice + yourChoice;
        }


        return result;
    }
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: " + yourChoice);
        System.out.println("Computer choice: " + computerChoice);
        System.out.println("Result: " + result);

    }

    //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     *
     * Inside the function:
     *
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

}