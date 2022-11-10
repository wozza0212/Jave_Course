import java.util.Random;
import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        String rules = scan.nextLine();
        if (!rules.equals("")) {
            System.out.println("It's like Poker, but a lot simpler.");
            System.out.println("- There are two players, you and the computer.");
            System.out.println("- The dealer will give each player one card.");
            System.out.println("- Then, the dealer will draw five cards (the river)");
            System.out.println("- The player with the most river matches wins!");
            System.out.println("- If the matches are equal, everyone's a winner!");
            System.out.println("- Ready? Type anything if you are.");
            scan.nextLine();
            while (true) {
                String playerCard = returnCard();
                String dealerCard = returnCard();
                System.out.println("This is your card!");
                System.out.println(playerCard);
                System.out.println("\nThis is the dealers card!");
                System.out.println(dealerCard);
                System.out.println("\nThe dealer will now draw 5 cards");

                String card1 = returnCard();
                String card2 = returnCard();
                String card3 = returnCard();
                String card4 = returnCard();
                String card5 = returnCard();

                System.out.println("The dealer will now draw 5 more cards!");
                System.out.print("1." + card1);
                System.out.print("2." + card2);
                System.out.print("3." + card3);
                System.out.print("4." + card4);
                System.out.print("5." + card5);

                int playerScore = 0;
                int dealerScore = 0;

                if (playerCard.equals(card1)) {
                    playerScore += 1;}
                if (playerCard.equals(card2)) {
                    playerScore +=1;}
                if (playerCard.equals(card3)) {
                    playerScore += 1;}
                if (playerCard.equals(card4)) {
                    playerScore +=1;}
                if (playerCard.equals(card5)) {
                    playerScore +=1;
                }

                if (dealerCard.equals(card1)) {
                    dealerScore += 1;}
                if (dealerCard.equals(card2)) {
                    dealerScore +=1;}
                if (dealerCard.equals(card3)) {
                    dealerScore += 1;}
                if (dealerCard.equals(card4)) {
                    dealerScore +=1;}
                if (dealerCard.equals(card5)) {
                    dealerScore +=1;}


                System.out.println("You have " + playerScore + " matches!");
                System.out.println("The dealer has " + dealerScore + " matches");
                if (playerScore > dealerScore) {
                    System.out.println("Congratulation, you have won this time!");
                } else if (dealerScore > playerScore) {
                    System.out.println("Dealer wins!");
                } else {
                    System.out.println("It's a Tie!");
                }
                break;


            }
        } else {
            System.out.println("See you next time!");
        }
    }

    public static String returnCard() {
        Random random = new Random();
        int card = random.nextInt(1,14);
        return switch (card) {
            case 1 -> """
                       _____
                      |A _  |
                      | ( ) |
                      |(_'_)|
                      |  |  |
                      |____V|
                    """;
            case 2 -> """
                       _____
                      |2    |
                      |  o  |
                      |     |
                      |  o  |
                      |____Z|
                    """;
            case 3 -> """
                       _____
                      |3    |
                      | o o |
                      |     |
                      |  o  |
                      |____E|
                    """;
            case 4 -> """
                       _____
                      |4    |
                      | o o |
                      |     |
                      | o o |
                      |____h|
                    """;
            case 5 -> """
                       _____\s
                      |5    |
                      | o o |
                      |  o  |
                      | o o |
                      |____S|
                    """;
            case 6 -> """
                       _____\s
                      |6    |
                      | o o |
                      | o o |
                      | o o |
                      |____6|
                    """;
            case 7 -> """
                       _____\s
                      |7    |
                      | o o |
                      |o o o|
                      | o o |
                      |____7|
                    """;
            case 8 -> """
                       _____\s
                      |8    |
                      |o o o|
                      | o o |
                      |o o o|
                      |____8|
                    """;
            case 9 -> """
                       _____\s
                      |9    |
                      |o o o|
                      |o o o|
                      |o o o|
                      |____9|
                    """;
            case 10 -> """
                       _____\s
                      |10  o|
                      |o o o|
                      |o o o|
                      |o o o|
                      |___10|
                    """;
            case 11 -> """
                       _____
                      |J  ww|
                      | o {)|
                      |o o% |
                      | | % |
                      |__%%[|
                    """;
            case 12 -> """
                       _____
                      |Q  ww|
                      | o {(|
                      |o o%%|
                      | |%%%|
                      |_%%%O|
                    """;
            case 13 -> """
                       _____
                      |K  WW|
                      | o {)|
                      |o o%%|
                      | |%%%|
                      |_%%%>|
                    """;
            default -> "Invalid card reference";
        };
    }
}
