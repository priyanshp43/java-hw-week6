package javaprogrammesweek6;

/**
 * To convert a given string into lowercase
 */

import java.util.Scanner;

public class StringIntoLowercase {

        public static void main (String[] args){

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lowercase
        String lowerCaseString = inputString.toLowerCase();

        // Print the result
        System.out.println("The string in lowercase is: " + lowerCaseString);

        // Close the scanner
        scanner.close();
    }
    }

