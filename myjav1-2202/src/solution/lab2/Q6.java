package solution.lab2;

import java.util.Scanner;

/**
 * 
 * @author kimlee
 *
 */

public class Q6 {

	static Scanner scan = new Scanner(System.in);
	
	public static void show() {
		
		System.out.println( "Enter number: " );
		int n = scan.nextInt();
		boolean isEven = n % 2 == 0;
		
		System.out.printf( "Is %d an even number? ", n );
		System.out.println( isEven );
		System.out.println("====================================");
	}



}
