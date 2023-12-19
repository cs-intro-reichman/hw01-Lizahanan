/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int  side3 = Integer.parseInt(args[2]);

        
        
            if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
                System.out.println( side1 + " " + side2 + " " + side3 + " true ");
            } else {
                System.out.println(side1 + " " + side2 + " " + side3 + " false ");
            }
    
        
	}
}
