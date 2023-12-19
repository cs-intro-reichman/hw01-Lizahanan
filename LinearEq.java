/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	// Put your code here
    public static void main(String[] args) {
        
    
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
   double x = (c - b)/a ;

     {

    System.out.println(a + " * x + " + b  + " = " + c ); {
        System.out.println("x = " + x );
    }
}
}
}
