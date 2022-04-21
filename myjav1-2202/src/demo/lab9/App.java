package demo.lab9;

import java.util.Scanner;

public class App {

	static Scanner scan = new Scanner( System.in );
	
	public static void doTask( int option ) {
		switch ( option ) {
			case 0: 
				Demo.show(); break;
			case 1: 
//				Q1.show(); break;
			case 2:
//				Q2.show(); break;
			case 3:
//				Q3.show(); break;
			case 4:
//				Q4.show(); break;
			case 5:
//				Q5.show(); break;
			case 6:
//				Q6.show(); break;
			case 7:
//				Q7.show(); break;

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
    		
    		if( op >= 0 ) doTask( op );
    		
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
    	System.out.println( "4) Question 4" );
    	System.out.println( "5) Question 5" );
    	System.out.println( "6) Question 6" );
    	System.out.println( "7) Question 7" );
    	System.out.println();
    }
	
}
