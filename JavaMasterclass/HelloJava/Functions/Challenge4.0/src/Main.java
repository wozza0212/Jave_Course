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

    /*Task 2: Set up the game


       • if the answer is yes:
             – print: Great!
             – print: rock – paper – scissors, shoot!
             – pick up user's choice.
             – get the computer choice (can only be done after task 3).
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).

       • else:
             – print: Darn, some other time...!
    */
        if (isPlaying.equals("yes")) {
            System.out.println("Great");
            System.out.println("Rock - Paper - Scissors, shoot");
            String usersChoice = scan.nextLine();
            String CompPick = computerChoice();
            System.out.println(result(usersChoice, CompPick));


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



    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String)
     *  @return result (String)

     * Inside the function:
     *   1. result is "You win" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     *
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. result is "It's a tie" if:
     *
     *       your choice equals computer choice.
     *
     */

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals(computerChoice)) {
            result = "Its a tie!";
        } else if ((yourChoice.equals("rock") && computerChoice.equals("paper")) ||
                (yourChoice.equals("paper") && computerChoice.equals("scissors")) ||
                (yourChoice.equals("scissors") && computerChoice.equals("paper"))) {
            result = "Congratulations, You win";
        } else if ((computerChoice.equals("rock") && yourChoice.equals("paper")) ||
                (computerChoice.equals("paper") && yourChoice.equals("scissors")) ||
                (computerChoice.equals("scissors") && yourChoice.equals("paper"))) {
            result = "Unlucky, it looks like you lose!";
        } else {
            result = "I dont know what's happened here!" + computerChoice + yourChoice;
        }


        return result;
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