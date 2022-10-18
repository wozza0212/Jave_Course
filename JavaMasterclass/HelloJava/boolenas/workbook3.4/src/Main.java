public class Main {
    public static void main(String[] args) {

        int temp = 9;

        String forecast = "";

        if (temp < -1 && temp < -15 ) {
            forecast = ("The forecast is FREEZING! Stay home!");
        } else if (temp > 0 && temp < 10) {
            forecast = ("The forecast is Chilly. Wear a coat!");
        } else {
            forecast = ("It's warm. go outside!");
        }

        //IF - ELSE IF - ELSE STATEMENTS HERE!

        //if temp between -15 and -1: "The forecast is FREEZING! Stay home!"

        //if temp between 0 and 10: "The forecast is Chilly. Wear a coat!";

        //else: It's warm. go outside!

        System.out.println(forecast);
    }
}