package p1;

import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Data data = new Data();
		
		while (true) {
			System.out.print("Enter number (Q to quit): ");
			String num = input.next();
			
			if (num.equals("Q") || num.equals("q")) {
				break;
			}
			
			double value = Double.parseDouble(num);
			data.Workin(value);
		}
		
		System.out.println("Average = " + data.Average());
	    System.out.println("Maximum = " + data.Max());
	    
	    input.close();
	}

}