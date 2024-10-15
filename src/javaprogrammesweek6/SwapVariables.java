package javaprogrammesweek6;

/**
 * swap two variables
 */

public class SwapVariables {
    public static void main(String[] args) {
        // Initialize two variables
        int a = 5;
        int b = 10;

        // Concatination
        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swap the values using a temporary variable
        int temp = a ;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);

    }
}
