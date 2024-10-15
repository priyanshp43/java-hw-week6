package javaprogrammesweek6;

/**
 * print the area and parameter of a rectangle.
 */
public class ParameterOfRectangle {
    public static void main(String[] args) {
        // Test data
        double width = 5.5 ;
        double height = 8.5 ;

        // Calculate the area
        double area = width * height;

        //Calculate the parameter
        double parameter = 2 * (width + height);


        // Print the results
        // Concatination
        System.out.println("Area of rectangle: " + area);
        System.out.println("Parameter of the rectangle: " + parameter);



    }
}
