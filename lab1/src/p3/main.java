package p3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Please, write your temperature value: ");
    	Double value = input.nextDouble();
    	
    	input.close();
        
    	Temperature temp1 = new Temperature(value, 'C');
        
    	System.out.println("Temperature 1: " + temp1.getValue() + " " + temp1.getScale());
        System.out.println("Temperature 1 in Fahrenheit: " + temp1.getFahrenheit());
        
        Temperature temp2 = new Temperature(value, 'F');
        System.out.println("Temperature 2: " + temp2.getValue() + " " + temp2.getScale());
        System.out.println("Temperature 2 in Celsius: " + temp2.getCelsius());
    }

}
