import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int questionCounter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Good evening and welcome to the Quiz");
        System.out.println("What is your name?");
        questionCounter++;
        String name = scan.nextLine();
        System.out.println("How much do you spend on climbing gear each month?");
        questionCounter++;
        double spendClimb = scan.nextDouble();
        System.out.println("How much do you spend on food each week?");
        questionCounter++;
        int spendFood = scan.nextInt();
        System.out.println("Your name is " + name + ", you spend £" + spendFood + "on food each week, and you spend £" + spendClimb + " on climbing gear each month!");
        System.out.println("Thankyou for answering all " + questionCounter + " Questions");
        scan.close();
    }
}