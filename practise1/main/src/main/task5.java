package main;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		double InitialBalance, NewBalance, interest;
		Scanner input = new Scanner(System.in);
		InitialBalance = input.nextDouble();
		interest = input.nextDouble();
		NewBalance = InitialBalance + (InitialBalance * interest/100);
		System.out.println("New Balance is: "+ NewBalance);
	}

}
