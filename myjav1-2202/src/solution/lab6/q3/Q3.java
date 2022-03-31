package solution.lab6.q3;

import java.util.Scanner;

public class Q3 {


	static Scanner scan = new Scanner(System.in);
	static public void show() {

		//Polymorphic object
		Circle shape = new ResizableCircle(10);
		if( ResizableCircle.class.isInstance(shape) ) 
			((ResizableCircle)shape).resize(100);
		
		System.out.println();
		//Alternatively, 
		ResizableCircle rzCircle = new ResizableCircle(7);
		rzCircle.resize(100);
		
		System.out.println( "\nDone..." );	
		System.out.println("====================================");
	}

}
