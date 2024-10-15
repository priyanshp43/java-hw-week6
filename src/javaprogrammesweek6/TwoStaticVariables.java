package javaprogrammesweek6;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class TwoStaticVariables {

    // Declaration of two static variables
    static int c = 50;
    static String name = "Urvisha";


    // Static Method
    static void s1() {
        System.out.println(c);
        System.out.println(name);
    }


    //Main method

    public static void main(String[] args) {
        TwoStaticVariables obj = new TwoStaticVariables();
        obj.s1();


    }


}
