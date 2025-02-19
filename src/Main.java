// Special thanks to Bro Code for his videos
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		
		// Using the Max method
		double z = Math.max(x, y);
		System.out.println(z);
		
		// Using the min method
		double a = Math.min(x, y);
		System.out.println(a);
		
		// Using the absolute function method
		double b = Math.abs(y);
		System.out.println(b);
		
		// Using the square root function method
		double c = 4;
		double d = Math.sqrt(c);
		System.out.println(d);
		
		// Using the round function method
		double e = Math.round(x);
		System.out.println(e);
		
		// Using the ceiling function method
		double f = Math.ceil(x);
		System.out.println(f);
		
		// Using the floor function method
		double g = Math.floor(x);
		System.out.println(g);
		
		/*
		 * Create a program that will find the hypotenuse of a triangle
		 */
		double side1;
		double side2;
		double side3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter side 1: " );
		side1 = in.nextDouble();
		System.out.println("Enter side 2: ");
		side2 = in.nextDouble();
		
		side3 = Math.sqrt((side1 * side1) + (side2 * side2));
		
		System.out.println("The hypotenuse is: " + side3);
		
		in.close();
		
		
	}

}
