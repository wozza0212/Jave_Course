import java.util.Scanner;

public class Workbook5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        //Task 1 – Scan for the nextLine(), and print it 99 times.
        String toRepeat = scan.nextLine();

        for (int i=0; i <= 99; i++) {
            System.out.println(toRepeat);
        }



    }
}
