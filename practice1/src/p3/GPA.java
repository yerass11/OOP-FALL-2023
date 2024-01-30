package p3;

import java.util.Scanner;

public class GPA {

	public static void main(String[] args) {
//		Write a program that displays a grade (A, A-, B+..) 
//		according to a number that a user enters on the console screen.
//		It's up to you, which conditional statements to use. 
//		(Use KBTU grading system!).
		double score;
		Scanner input = new Scanner(System.in);
		score = input.nextDouble();
		score += 0.5;
		if (score>=95 && score<=100.5) {
			   System.out.println("Your grade: A");
			   
			  }
			  else if (score>=90 && score<95) {
			   System.out.println("Your grade: A-");
			   
			  }
			  else if (score>=85 && score<90) {
			   System.out.println("Your grade: B+");
			   
			  }
			  else if (score>=80 && score<85) {
			   System.out.println("Your grade: B");
			   
			  }
			  else if (score>=75 && score<80) {
			   System.out.println("Your grade: B-");
			   
			  }
			  else if (score>=70 && score<75) {
			   System.out.println("Your grade: C+");
			   
			  }
			  else if (score>=65 && score<69) {
			   System.out.println("Your grade: C");
			   
			  }
			  else if (score>=60 && score<65) {
			   System.out.println("Your grade: C-");
			   
			  }
			  else if (score>=55 && score<60) {
			   System.out.println("Your grade: D+");
			   
			  }
			  else if (score>=50 && score<55) {
			   System.out.println("Your grade: D");
			   
			  }
			  else if (score>=0 && score<50){
			   System.out.println("Your grade: F");
			  } else {
				  System.out.println("ERROR");
			  }

		
	}

}
