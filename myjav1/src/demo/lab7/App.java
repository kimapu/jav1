package demo.lab7;

import java.util.Scanner;

import solution.lab7.q1.Q1;
import solution.lab7.q2.Q2;
import solution.lab7.q3.Q3;


public class App {

	static Scanner scan = new Scanner( System.in );
	
	public static void doTask( int option, String arg ) {
		switch ( option ) {
			case 0: 
				Demo.show(); break;
			case 1: 
				/**
				 * Run As -> Run configurations... -> Arguments -> type 3+4 -> Run
				 */
				Q1.show( arg ); break;
			case 2:
				Q2.show(); break;
			case 3:
				Q3.show(); break;
			default:
				throw new IllegalArgumentException("Unexpected value: " +  option );
		}
	}
	
    public static void main(String[] args) {
    	int op = -1;
    	do {
    		menu();
    		System.out.println( ">> Enter your choice: " );
    		op = scan.nextInt();
    		
    		if( op >= 0 ) doTask( op, args[0] );
    		
		} while( op >= 0 );
    	System.out.println( "\n>>> Program quit!" );
    	System.exit(0);
	}
    
    static void menu() {
    	System.out.println( ">>> MENU OPTION..." );
    	System.out.println( "-1) Quit" );
    	System.out.println( "0) Demo" );
    	System.out.println( "1) Question 1" );
    	System.out.println( "2) Question 2" );
    	System.out.println( "3) Question 3" );
    	System.out.println();
    }
	
}
