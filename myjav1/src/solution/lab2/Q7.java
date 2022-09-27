package solution.lab2;

import java.util.Scanner;

public class Q7 {
	
	static final int DIVIDER1 = 5;
	static final int DIVIDER2 = 6;

	static Scanner scan = new Scanner(System.in);
	
	public static void show() {
		
		System.out.println( "Enter number: " );
		int n = scan.nextInt();
		
		System.out.printf( "Is %d divisible by %d and %d? ", n, DIVIDER1, DIVIDER2 );
		System.out.println( ((n % DIVIDER1) == 0 & (n % DIVIDER2) == 0) );
		System.out.printf( "Is %d divisible by %d or %d? ", n, DIVIDER1, DIVIDER2 );
		System.out.println( ((n % DIVIDER1) == 0 | (n % DIVIDER2) == 0) );
		System.out.printf( "Is %d divisible by %d and %d, but not both? ", n, DIVIDER1, DIVIDER2 );
		System.out.println( ((n % DIVIDER1) == 0 || (n % DIVIDER2) == 0) );
		

		System.out.println("====================================");
	}


	
}
