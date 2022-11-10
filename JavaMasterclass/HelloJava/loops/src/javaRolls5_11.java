import java.util.Random;
import java.util.Scanner;

public class javaRolls5_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.

        int diceRoll;
        int score = 0;
        System.out.println("Let's play Rolling Java. Type anything to start.");
        String showRules  = scan.nextLine();
        if (!showRules.equals("")) {
            System.out.println("Great, here are the rules:");
            System.out.println(">> - If you roll a 6, the game stops.");
            System.out.println(">> - If you roll a 4, nothing happens.");
            System.out.println(">> - Otherwise, you get 1 point.\\n");
            System.out.println(">> You must collect at least 3 points to win. Enter anything to roll:\n" +
                    "\n");

            while (true) {
                scan.nextLine();
                diceRoll = diceRoll();
                System.out.println("You rolled a " + diceRoll);
                if (diceRoll == 6) {
                    System.out.println("Game over! \nYou scored " + score + " points");
                    break;
                } else if (diceRoll == 1 || diceRoll == 2 || diceRoll ==3 || diceRoll==5) {
                    score += 1;
                    System.out.println("You scored a point! \nYou're now on " + score + " points");
                } else {
                    System.out.println("You scored Zero points \nYou're now on " + score + " points\"");
                }

            }
            if (score >= 3) {
                System.out.println("Congratulations, You win");
            } else {
                System.out.println("You Lose!");
            }
        }
    }

    public static int diceRoll() {
        Random random = new Random();
        return random.nextInt(1, 7);

    }
}
