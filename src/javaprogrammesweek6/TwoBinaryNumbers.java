package javaprogrammesweek6;

/**
 * Add two binary numbers
 */

import java.util.Scanner;

public class TwoBinaryNumbers {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);


        // Ask user to enter first binary number
        System.out.println("Input first binary number: ");
        String binary1 = scanner.nextLine();

        // Ask user to enter second binary number
        System.out.println("Input second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary numbers to decimal
        int decimal1 = Integer.parseInt(binary1,2);
        int decimal2 = Integer.parseInt(binary2,2);

        // Add the Two decimal numbers
        int decimalsum = decimal1 + decimal2 ;

        // Convert the sum back to binary
        String binarySum = Integer.toBinaryString(decimalsum);

        // Print the result
        System.out.println("Sum of the two binary numbers: " + binarySum);

        // CLose the scanner
        scanner.close();

    }
}
