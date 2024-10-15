package javaprogrammesweek6;


/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class TwoInstanceTwoStatic {

    // Declaration of two instance and two static variables

    int a = 22;
    int b = 20;

    static String name = "Urvisha";
    static String surname = "Parmar";


    // Calling Instance Method

    public void instance(){
        System.out.println(a);
        System.out.println(b);
        TwoInstanceTwoStatic t1 = new TwoInstanceTwoStatic();
        System.out.println(t1.name);
        System.out.println(t1.surname);

    }

    // Calling Main Method

    public static void main(String[] args) {
        TwoInstanceTwoStatic is = new TwoInstanceTwoStatic();
        is.instance();
        TwoInstanceTwoStatic is1 = new TwoInstanceTwoStatic();
        is1.s1();


    }

    // Calling Static method

    public static void s1() {
        TwoInstanceTwoStatic t2=new TwoInstanceTwoStatic();
        System.out.println(t2.a);
        System.out.println(t2.b);
        System.out.println(name);
        System.out.println(surname);


    }
}
