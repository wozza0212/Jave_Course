import java.util.Random;

public class doubles5_10 {
    public static void main(String[] args) {

        //      See Learn the Part for instructions.

        int dice1 = diceRoll();
        int dice2 = diceRoll();

        while (dice1!=dice2) {

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);

            dice1 = diceRoll();
            dice2 = diceRoll();

        }

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("Congratulations, you finally rolled a double!");


    }

    public static int diceRoll() {
        Random random = new Random();

        return random.nextInt(1, 7);


    }
}

