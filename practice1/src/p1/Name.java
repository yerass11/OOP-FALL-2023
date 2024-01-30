package p1;

import java.util.Scanner;


public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);  // Create a Scanner object
	   

		String name = input.nextLine();  // Read user input
	    
	    // +----+
	    System.out.print("+");
	    for (int i = 0; i < name.length(); ++i) {
	    	System.out.print("-");
	    }
	    System.out.println("+");
	    
	    // |name|
	    System.out.print("|");
	    System.out.print(name);
	    System.out.println("|");
	    
	    // +----+
	    System.out.print("+");
	    for (int i = 0; i < name.length(); ++i) {
	    	System.out.print("-");
	    }
	    System.out.println("+");
	}

}
