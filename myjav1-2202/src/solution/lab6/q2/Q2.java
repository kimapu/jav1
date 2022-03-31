package solution.lab6.q2;

import java.util.Scanner;

public class Q2 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {
		
		Movable moveShape1 = new MovableCircle(5, 5, 6, 6, 7);
		System.out.println( moveShape1 );
		
		System.out.println( "\nDone..." );	
		System.out.println("====================================");
	}

}
