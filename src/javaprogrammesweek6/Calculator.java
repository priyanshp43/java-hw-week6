package javaprogrammesweek6;

/**
 * calculator with addition, subtraction, multiplication
  and division methods all with parameters and use string concatenation methods.
 */
public class Calculator {
    public static void main(String[] args) {
        addition();
        Calculator np = new Calculator();
        np.subtraction();
        np.multiplication();
        np.division();

    }


    public static void addition() {  // no return type bcz it has void word
        int a = 10;
        int b = 100;
        int ans = a + b;

        // Concatination

        System.out.println("Addition of two number " + a + " and " + b + " is " + ans + ".");
    }

    // substraction method
    public static void subtraction() {   // no return type bcz it has void word, no params
        int a = 110;
        int b = 11;
        int ans = a - b;
        System.out.println("Subtraction of two numbers " + a + " and " + b + " is " + ans + ".");

    }

    //multiplication method
    void multiplication() {   // no return type bcz it has void word, no params
        int a = 10;
        int b = 20;
        int ans = a * b;
        System.out.println("multiplication of two numbers " + a + " and " + b + " is " + ans + ".");
    }

    // division method
    public void division() {
        int a = 99;
        int b = 9;
        int ans = a / b;
        System.out.println("Division of two numbers " + a + " and " + b + " is " + ans + ".");


    }

}


