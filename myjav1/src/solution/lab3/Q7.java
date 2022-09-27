package solution.lab3;

import java.util.Scanner;

public class Q7 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {
		
		String cont = "";
		
		do {
			System.out.println( "continue? [yes/no]" );
			cont = scan.next();
			
		} while ( cont.equalsIgnoreCase("yes") );
		System.out.println( ">> Q7 is ended!" );
		System.out.println("====================================");
	}
}
