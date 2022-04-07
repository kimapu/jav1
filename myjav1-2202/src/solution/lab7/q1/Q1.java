package solution.lab7.q1;

import java.util.Scanner;

public class Q1 {


	static Scanner scan = new Scanner(System.in);

	static public void show(String arg) {
	
		String result = "";
		try {
			check( arg );

			result = arg;
			switch (arg.charAt(1)) {
			case '+':
				System.out.println( String.join("=", result, 
						String.valueOf( Integer.parseInt(String.valueOf(arg.charAt(0))) + Integer.parseInt(String.valueOf(arg.charAt(2))) )
						) );
				break;
			case '-':
				System.out.println( String.join("=", result, 
						String.valueOf( Integer.parseInt(String.valueOf(arg.charAt(0))) - Integer.parseInt(String.valueOf(arg.charAt(2))) )
						) );
				break;
			case '*':
				System.out.println( String.join("=", result, 
						String.valueOf( Integer.parseInt(String.valueOf(arg.charAt(0))) * Integer.parseInt(String.valueOf(arg.charAt(2))) )
						) );
				break;
			case '/':
				System.out.println( String.join("=", result, 
						String.valueOf( Integer.parseInt(String.valueOf(arg.charAt(0))) / Integer.parseInt(String.valueOf(arg.charAt(2))) )
						) );
				break;

			default:
				break;
			}
			
		} catch (Exception e) {
			System.err.println( "Wrong input: "+ arg );
		}

		System.out.println("\nDone...");
		System.out.println("====================================");

	}
	
	static String check( String arg ) throws Exception
	{
		if ( arg.length() != 3 ) 
			throw new Exception();

		for (char c : arg.toCharArray()) {
			if ( Character.isDigit(c) ) 
				Integer.parseInt( String.valueOf(c) );
		}
		
		return arg;
	}
	
	

}
