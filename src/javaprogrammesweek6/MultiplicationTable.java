package javaprogrammesweek6;

/**
 * Program that takes a number as input and prints its
   multiplication table up to 10.
 */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);


        // Ask the user to enter a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Print the  multiplication table up to 10
        for(int i=1;i<=10;i++)
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner
        scanner.close();
    }
}
