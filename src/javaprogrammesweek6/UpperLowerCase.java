package javaprogrammesweek6;

/**
 * Convert the upper case to lower case
 */

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);


        // Ask the user to  enter a string uppercase
        System.out.println("Enter a string in uppercase: " );
        String upperCaseString = scanner.nextLine();

        // Convert the string to lowercase
        String lowercaseString = upperCaseString.toLowerCase();

        // Print the result
        System.out.println("The string in lowercase is: " + lowercaseString);

        //Close the scanner
        scanner.close();



    }
}
