package p2;

import java.util.Scanner;

public class Mathem {

	public static void main(String[] args) {
		// Create a program to calculate an area, perimeter, 
		//and the length of diagonal of a square with a side a, 
		//that your program must read from user input using
		//Scanner class.
		double a, s, p, d;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		s = a * a;
		p = 4 * a;
		d = Math.sqrt(2) * a;
		
		System.out.println("Side is "+ a);
		System.out.println("Area is "+ s);
		System.out.println("Perimeter is "+ p);
		System.out.println("Diagonal is "+ d);

	}

}
