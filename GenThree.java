/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		 int lowerBound = Integer.parseInt(args[0]);
         int upperBound = Integer.parseInt(args[1]); 
    
         Random random = new Random();
        int num1 = Random.nextInt( upperBound - lowerBound) + lowerBound;
        int num2 = Random.nextInt( upperBound - lowerBound) + lowerBound;
        int num3 = Random.nextInt( upperBound - lowerBound) + lowerBound; 

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3); 

        int minimal = Math.min (Math.min(num2, num3), num3);

        System.out.println("The minimal generated number was " + minimal);
	}
}
