public class Main {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        double noonCelsius = fahrenheitToCelsius(noon);
        double eveCelsius = fahrenheitToCelsius(evening);
        double midCelsius = fahrenheitToCelsius(midnight);

        printTemperatures(noon, noonCelsius);
        printTemperatures(noon, eveCelsius);
        printTemperatures(noon, midCelsius);

        //Task 3 - Call the printTemperatures function.



    }


    //Task 1: Make a function here. See the doc comments below.
    public static double fahrenheitToCelsius(double temp) {
        double celsius = (temp - 32) * 5 / 9;

        return celsius;

    }

    public static void printTemperatures(double fahrenheit, double celsius) {
        System.out.println("The temperature in fahrenheit is " + fahrenheit);
        System.out.println("The temperature in celsius is " + celsius);


    }

    //Task 2: Make a function here. See the doc comments below.

    /**
     * Function name: printTemperatures – prints both temperature values.
     * @param fahrenheit (double)
     *
     * Inside the function:
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> .
     */
}