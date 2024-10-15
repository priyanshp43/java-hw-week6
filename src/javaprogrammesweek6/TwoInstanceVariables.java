package javaprogrammesweek6;

/**1.1 Declare 2 instance variables.
 1.2 Declare one instance method.
 1.3 Call both instance variables into the instance method inside the print statement.
 1.4 Declare the Main method.
 1.5 Call the above instance method into the Main method and Run the programme.
 */


public class TwoInstanceVariables {
    int a = 10;                           // a & b are instance variables
    int b = 20;



// Static main method
public static void main(String[] args) {
   TwoInstanceVariables obj = new TwoInstanceVariables();
   obj.p1();
}


// Instance Method
public void p1(){
    System.out.println(a);
    System.out.println(b);
}

}
