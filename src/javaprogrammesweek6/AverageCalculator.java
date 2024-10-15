package javaprogrammesweek6;
/**
 * program that takes three numbers as input to calculate and
      print the average of the numbers.
 */

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Promt the user to enter three numbers
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the average
        double average = (num1 + num2 + num3 )/3;

        //Print the result
        // Concatination
        System.out.println("The average of the three numbers is: " + average);

        // Close the scanner
        scanner.close();


    }
}
