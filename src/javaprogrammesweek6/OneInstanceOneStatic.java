package javaprogrammesweek6;


/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */


public class OneInstanceOneStatic {

    // Declaration of 1 Instance and 1 Static Variable
    int m = 100;
    static String message = "Hi, Morning";


    // Static method
    public void staticmethod() {
        OneInstanceOneStatic obj = new OneInstanceOneStatic();
        System.out.println(m);
        System.out.println(message);
    }


    // Main method

    public static void main(String[] args) {
        OneInstanceOneStatic t = new OneInstanceOneStatic();
        t.i1();
        t.staticmethod();


    }


    //i1 is an Instance Method

    public void i1() {
        System.out.println(m);
        OneInstanceOneStatic obj1 = new OneInstanceOneStatic();
        System.out.println(obj1.message);


    }

    ;


}
