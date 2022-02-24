package demo.lab3;

import java.util.Scanner; 

public class Demo {


	//Scanner obj
    static Scanner scan = new Scanner(System.in);

    //Main method - stub method to be triggered at runtime
    public static void show() {

    	System.out.println( ">> DEMO (Control structure)..." );
    	System.out.println( ">>> SELECTION..." );
    	select();
    	System.out.println( "\n\n>>> REPEATION..." );
    	repeat();
    	System.out.println( "\n\n>>> ENHANCED-FOR..." );
    	enhanceFor();

        System.out.println("====================================");
        
    }
	
    /**
     * Enhanced-for
     */
    static void enhanceFor() {
    	System.out.println( ">>>> Listing..." );
    	System.out.println( "for (String name : nameLst) {" );
    	System.out.println( "\tSystem.out.println( \"Name: \"+ name );" );
    	System.out.println( "}" );
    	System.out.println( "=== OUTPUT ===" );
    	String[] nameLst = new String[] { "john", "mary", "ethan", "mohd-ali", "helen" };
    	for (String name : nameLst) {
			System.out.println( "Name: "+ name );
		}
    	
    }

    /**
     * Selection
     */
    static void select() {

    	/**
    	 * REQ: Check a number for positive or negative.
    	 */
    	System.out.println( ">>>> Listing..." );
    	System.out.println( "if ( n > 0 )" );
    	System.out.println( "\tSystem.out.printf( \"the %d is positive number.\" , n );" );
    	System.out.println( "else" );
    	System.out.println( "\tSystem.out.printf( \"the %d is negative number.\" , n );" );
    	System.out.println( "=== OUTPUT ===" );
    	System.out.println( "Enter number: " );
    	int n = scan.nextInt();
    	if ( n > 0 )
			System.out.printf( "the %d is positive number." , n );
    	else
			System.out.printf( "the %d is negative number." , n );
    	System.out.println();
    }
    
    
    /**
     * Repetition
     */
    static void repeat() {
    	
    	/**
    	 * REQ: Print '*' for 10 times.
    	 * 		OUTPUT:
    	 * 			************
    	 */
    	System.out.println( ">>>> Listing..." );
    	System.out.println( "for (int i = 0; i < MAX; i++) {" );
    	System.out.println( "\tSystem.out.print( \"*\" );" );
    	System.out.println( "}" );
    	System.out.println( "=== OUTPUT ===" );
    	final int MAX = 10;
    	for (int i = 0; i < MAX; i++) {
			System.out.print( "*" );
		}
    	System.out.println();
    }
    
}
