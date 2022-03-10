package solution.lab4.q2;

import java.util.Scanner;

public class Q2 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {

		//Fan obj
		Fan fan1 = new Fan(Speed.FAST, true, 10, "yellow");
		
		System.out.println( fan1 );
		
		System.out.println("====================================");
	}
}
