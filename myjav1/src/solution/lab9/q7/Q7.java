package solution.lab9.q7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q7 {

	public static void show() {

		System.out.println( "> Working with Collections class..." );

		System.out.println( "Number lst: 2,12,98,77,55,34,7,23,5,33,77,89,12,34,5" );
		List<Integer> numLst = Arrays.asList(2,12,98,77,55,34,7,23,5,33,77,89,12,34,5);
		
		System.out.println( "Collections.min():" + Collections.min(numLst) );
		System.out.println( "Collections.max():" + Collections.max(numLst) );
		
		System.out.println("====================================");
	
	}
	

}
