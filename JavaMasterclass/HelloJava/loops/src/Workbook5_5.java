import java.util.Scanner;

public class Workbook5_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");
        System.out.print("Please, pick a number to count by: ");
        int countBy = scan.nextInt();
        scan.nextLine();
        System.out.print("Now, pick a number to count from: ");
        int countFrom = scan.nextInt();
        scan.nextLine();
        System.out.print("Finally, pick a number to count to: ");
        int countTo = scan.nextInt();
        scan.nextLine();

        for (int i = countFrom; i <= countTo; i = i + countBy) {
            System.out.println(i);

        }




      /* Task 2 – Create a for loop that:
            1. starts from the second number.
            2. stops at the third number.
            3. counts in steps of the first.
      */

        scan.close();


    }
}
