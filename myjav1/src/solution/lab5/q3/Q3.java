package solution.lab5.q3;

import java.util.Scanner;

public class Q3 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {

		String cont = "";
		do {
			
			System.out.println( "1) Test max() method for Circle/Cylinder" );
			System.out.println( "2) Test ComparableCylinder shape" );
			System.out.println( "3) Test Colorable for Square shape" );
			System.out.println( "Choose?" );
			handleTask( scan.nextInt() );
			System.out.println("\n>> Do you wanna continue? [yes/no]");
			cont = scan.next();

		} while ( "yes".equalsIgnoreCase(cont) );
		System.out.println( "\nDone..." );	
		System.out.println("====================================");
	}
	
	static void handleTask( int op )
	{
		switch (op) {
		case 1:
			//Q3
			System.out.println( ">> Creating 2 circle shape..." );
			GeometricObject s1 = new Circle(7);
			GeometricObject s2 = new Circle(10);
			System.out.println( s1 );
			System.out.println( s2 );
			System.out.println( "\n>> Comparing shape..." );
			
			System.out.print( "The largest: " );
			if( s1.max(s2) > 0 )
				System.out.println( s1 );
			else
				System.out.println( s2 );
			
			break;
		case 2:
			//Q3a
			System.out.println( ">> Creating 2 Cylinder shape..." );
			ComparableCylinder cy1 = new ComparableCylinder(17, 10);
			ComparableCylinder cy2 = new ComparableCylinder(10, 10);
			System.out.println( cy1 );
			System.out.println( cy2 );
			System.out.println( "\n>> Comparing shape..." );
			System.out.print("The largest: ");
			if( cy1.compareTo(cy2) > 0 )
				System.out.println( cy1 );
			else
				System.out.println( cy2 );
			
			break;
		case 3:
			//Q3b
			Square sq1 = new Square(0);
			sq1.howtocolor();
			break;
		default:
			break;
		}
	}
}
