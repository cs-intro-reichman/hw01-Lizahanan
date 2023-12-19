/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// Put your code here
            if (args.length !=2)	{
                  System.out.println("Please provide two integers as arguments");
            }
             try {
                  int a = Integer.parseInt(args[0]);
                  int b = Integer.parseInt(args[1]);

                  int sum = a + b;

                  System.out.println( a + "+" + b + "=" + sum);

                  
             } catch (NumberFormatException e) {
                  System.out.println("Please provide a valid integer argument");
             }
                 
             
             }

          
	}
