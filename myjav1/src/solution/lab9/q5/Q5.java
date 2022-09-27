package solution.lab9.q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q5 {

	static Scanner scan = new Scanner(System.in);
	public static void show() {

		List<Long> numLst = new LinkedList<>();
		
		long n;
		do {
			
			System.out.println("Enter positive num [-99 to stop]: ");
			n = scan.nextLong();
			
			if ( n > 0 ) numLst.add(n);
			
		} while ( n != -99);

		//List
		System.out.println( "\n> Duplicated numLst: " );
		System.out.println( numLst );
		//Set
		System.out.println( "\n> Nonduplicated numLst: " );
		Set<Long> nonRepeatLst = new LinkedHashSet<>(numLst);
		System.out.println( nonRepeatLst );
		//TreeSet
		System.out.println( "\n> Sorted numLst: " );
		Set<Long> sortedLst = new TreeSet<>(numLst);
		System.out.println( sortedLst );
		
		//Collections.shuffle()
		System.out.println( "\n> Collections.shuffle()" );
		List<Long> nextLst1 = new ArrayList<>(numLst);
		Collections.shuffle(nextLst1);
		System.out.println( nextLst1 );
		
		//Collections.reverse()
		System.out.println( "\n> Collections.reverse()" );		
		List<Long> nextLst2 = new ArrayList<>(numLst);
		Collections.reverse(nextLst2);
		System.out.println( nextLst2 );
		
		System.out.println();
		System.out.println("====================================");
		
	}


}
