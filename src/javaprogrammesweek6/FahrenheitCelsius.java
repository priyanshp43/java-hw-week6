package javaprogrammesweek6;

/**
 * Insert any temperature value in degree Fahrenheit and
   convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class FahrenheitCelsius{
    public static void main(String[] args) {
        // Create a Scanner objet to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the temperature  in Fahrenhit
        System.out.println("Enter temperature in Fahrenhit: ");
        double fahrenhit = scanner.nextDouble();

        // Convert Fahrenhit to Celsius using the formula (F - 32) * 5/9
        double celsius = (fahrenhit - 32) * 5/ 9 ;

        // Print the result
        System.out.println("Temperature in Celcius: " + celsius);

        // Close the scanner
        scanner.close();

    }

}
