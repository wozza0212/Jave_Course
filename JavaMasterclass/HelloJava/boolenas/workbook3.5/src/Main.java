public class Main {
    public static void main(String[] args) {
        int day = 6;   //3rd day of the week...
        boolean holiday = false;
        
        if (holiday) {
            System.out.println("Woohoo, no work!");
        } else if (day==6 || day==7) {
            System.out.println("it's the weekend, no wqrk!");
        } else {
            System.out.println("Wake up at 7:00 :(");
        }
        // if it's a holiday, print: "woohoo, no work!");
        // if it's the weekend, print: "it's the weekend, no work!"
        // otherwise, print: "Wake up at 7:00 :( ";;
    }
}