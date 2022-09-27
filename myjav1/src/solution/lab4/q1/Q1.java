package solution.lab4.q1;

import java.util.Scanner;

public class Q1 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {

		String color = "yellow";
		//1st Rectangle obj
		Rectangle r1 = new Rectangle( 5, 50, color );

		//2nd Rectangle obj
		Rectangle r2 = new Rectangle( 5, 50, color );
		
		System.out.println( r1 );
		System.out.println( r2 );
		
		System.out.println("====================================");
	}
	
}
