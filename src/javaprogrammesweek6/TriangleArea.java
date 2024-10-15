package javaprogrammesweek6;

/**
 * Calculate the area of a triangle
 */

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // create a scaner object to read input
        Scanner scanner = new Scanner(System.in);

        //Ask the user to enter the base of triangle
        System.out.println("Enter the base of triangle: ");
        double base = scanner.nextDouble();

        // Ask the user to enter the height of the triangle
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        //Calculate the area using the formula A = 0.5 * base * height
        double area = 0.5 * base * height;

        // Print tyhe result
        System.out.println("The area of a triangle is: " + area);

        // Close the Scanner
        scanner.close();


    }
}
