package solution.lab2;

import java.util.Scanner;


public class Q1 {
	
	static Scanner scan = new Scanner(System.in);

	static public void show() {
		// get input
		System.out.println("Enter a value in Fahrenheit: ");
		// scan the keyed in value and convert it into int type
		double fahrenheit = scan.nextDouble();
		// long feet = scan.nextLong();make programme for devices with
		// compute result
		double celcius = (fahrenheit - 32) * 5 / 9;
		// display result
		System.out.println("The temperature in Celcius is: " + celcius);
		System.out.println("====================================");
	}

}
