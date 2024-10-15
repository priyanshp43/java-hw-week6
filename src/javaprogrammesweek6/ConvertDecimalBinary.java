package javaprogrammesweek6;

/**
 * Convert decimal number into binary number
 */

import java.util.Scanner;

public class ConvertDecimalBinary {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter decimal number
        System.out.println("Input a Decimal Number: ");
        int decimal = scanner.nextInt();

        //Convert the decimal number to binary
        String binary = Integer.toBinaryString(decimal);

        // Print the result
        System.out.println("Binary representation: " + binary);

        // Close the scanner
        scanner.close();
    }
}
