package javaprogrammesweek6;

/**
 * Enter any radius value of the circle and find out the area
 */

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //Ask the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        //Calculate the area using the formula A= PI * r * r
        double area = Math.PI * radius * radius;

        //Print the result
        System.out.println("The area of the circle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
