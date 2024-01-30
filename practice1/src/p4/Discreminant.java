package p4;

import java.util.Scanner;

public class Discreminant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a;
		double b;
		double c;
		double D;
		
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		D = b*b - 4*a*c;
		if (D<0) {
			System.out.println("Error");
			System.exit(0);
		}
		if (D==0) {
			double t;
			t = -(b)/(2*a);
			System.out.println("We have only one root: "+ t);
			System.exit(0);
		}
		double t1,t2;
		t1 = (-(b)-Math.sqrt(D))/(2*a);
		t2 = (-(b)+Math.sqrt(D))/(2*a);
		System.out.println("First root: "+ t1);
		System.out.println("Second root: "+t2);  


	}

}
