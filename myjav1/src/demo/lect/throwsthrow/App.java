package demo.lect.throwsthrow;

import java.io.IOException;

public class App {

	public static void main(String[] args) {

//		try {
//			m1(-1);
//		} catch (Exception e) {
//			System.err.println( e.getMessage() );
//		}
		//m1(-1);
		
		try {
		
			m2();
			
		}catch( IOException ex) {
			System.err.println( ex.getMessage() );
		}
	}
	
	
	/**
	 * throws vs throw
	 */
	static void m2() throws IOException
	{
//		try {
//			//checked exception
//			throw new IOException( "> Random IOException!" );
//		} catch (Exception e) {
//			System.err.println( e.getMessage() );
//		}
		
		//alternatively, throws it to the calling code
		//checked exception
		throw new IOException( "> Random IOException!" );
		
	}
	
	static void m1( int n )
	{
		try {

			//negative checker
			if( n < 0 )
				//System.err.println( "> Negative value!" );		
				//generate unchecked exception obj programmatically
				throw new IllegalArgumentException("> Negative value!");
			
		} catch (IllegalArgumentException e) {
			System.err.println( e.getMessage() );
		}

	}
	
}
