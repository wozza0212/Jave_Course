import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Good evening and welcome to the Quiz");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("How much do you spend on climbing gear?");
        double spendClimb = scan.nextDouble();
        System.out.println("Your name is " + name + " and you spend £" + spendClimb + " on climbing gear!");
        scan.close();
    }
}