package solution.lab7.q3;

import java.util.Scanner;

public class Q3 {


	static Scanner scan = new Scanner(System.in);

	static public void show() {

		System.out.println( "Enter number 1: " );
		String n1 = scan.next();
		System.out.println( "Enter number 2: " );
		String n2 = scan.next();
		Calculator calc = new Calculator(n1, n2);

		System.out.println("\n> Calculating...");
		System.out.println( "Addition:"+ calc.add() );
		System.out.println( "Subtraction:"+ calc.sub() );
		System.out.println( "Multiplication:"+ calc.mul() );
		System.out.println( "Division:"+ calc.div() );


		System.out.println("\nDone...");
		System.out.println("====================================");

	}
	
}
