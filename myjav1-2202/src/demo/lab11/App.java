package demo.lab11;

import java.util.Scanner;

import solution.lab9.q3.Q3;
import solution.lab9.q4.Q4;
import solution.lab9.q5.Q5;
import solution.lab9.q6.Q6;
import solution.lab9.q7.Q7;

public class App {

	static Scanner scan = new Scanner( System.in );
	
	public static void doTask( int option ) {
		switch ( option ) {
			case 0: 
				Demo.show(); break;
			case 1: 
				System.out.println( "your attempt!" );
//				Q1.show(); break;
			case 2:
				System.out.println( "your attempt!" );
//				Q2.show(); break;
			case 3:
				System.out.println( "your attempt!" );
//				Q3.show(); break;

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
    	System.out.println();
    }
	
}
