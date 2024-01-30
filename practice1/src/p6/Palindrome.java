package p6;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;
		s = input.nextLine();
		
		if (s.isEmpty()) {
			System.out.println("Given string is palindrome"); 
			System.exit(0);
        }
		
        int start = 0;
        int last = s.length() - 1;
        
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        		// If we don't use toLowerCase, Racecar wouldnt be a palindrome 
        		System.out.println("Given string is not palindrome");
       			System.exit(0);
        	}
       		start++;
       		last--;
        	
        }
        System.out.println("Given string is palindrome"); 
	}
}
