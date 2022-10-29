
import java.util.Random;
public class Main {


    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

        //Task 5 – Call area functions.
        double square = areaSquare(2);
        double rectangle = areaRectangle(1, 2);
        double triangle = areaTriangle(1, 2);
        double circle = areaCircle(2);

        // double square = area of square with a side of 2.
        // double rectangle = area of rectangle with a length of 1, and a width of 2.
        // double triangle = area of triangle with a base of 1, and a width of 2.
        // double circle = area of circle with a radius of 2.

        //Task 7 – Call a function that prints all the areas.
        printAreas(square, rectangle, triangle, circle);

    }

    //Task 1 - Write a function that calculates the area of a square.

    public static double areaSquare(double side) {
        double area = (side * side);

        return area;
    }


    //Task 2 - Write a function that calculates the area of a rectangle.
    public static double areaRectangle(double length, double width) {

        double area = (length * width);

        return area;
    }

    //Task 3 - Write a function that calculates the area of a triangle.
    public static double areaTriangle(double base, double height) {
        double area = (base * height * 1 / 2);

        return area;
    }

    //Task 4 - Write a function that calculates the area of circle.
    public static double areaCircle(double radius) {
        double area = (3.14159265359 * radius);

        return area;
    }

    //Task 6: Write a function that prints every area.
    public static void printAreas(double square,double rectangle, double triangle, double circle ) {
        System.out.println("Square area: " + square);
        System.out.println("Rectangle area: " + rectangle);
        System.out.println("Triangle area: " +triangle);
        System.out.println("Circle area: " + circle);

    }

}