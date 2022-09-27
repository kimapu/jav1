package solution.lab6.q4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {
		
		new Q4().new TestCustomerSort().test();
		
		System.out.println( "\nDone..." );	
		System.out.println("====================================");
	}

	class TestCustomerSort{
		
		Customer[] cusLst = new Customer[5];
		{
			cusLst[0] = new Customer("michael", 20, LocalDate.of(2000, 2, 22));
			cusLst[1] = new Customer("jordan", 19, LocalDate.of(2001, 4, 2));
			cusLst[2] = new Customer("helen", 17, LocalDate.of(1999, 1, 13));
			cusLst[3] = new Customer("mary", 21, LocalDate.of(2010, 12, 28));
			cusLst[4] = new Customer("jacky", 27, LocalDate.of(1996, 9, 17));
		}
		
		void test()
		{
			
			String cont = "";
			do {
				System.out.println( ">> CUSTOMER LIST..." );
				Arrays.stream(cusLst).forEach(System.out :: println);
				System.out.println();
				
				System.out.println( "1) Sorting by Customer Age" );
				System.out.println( "2) Sorting by Customer DOB" );
				System.out.println( "Choose?" );
				
				handleTask( scan.nextInt(), cusLst.clone()  );
				
				System.out.println("\n>> Do you wanna continue? [yes/no]");
				cont = scan.next();

			} while ( "yes".equalsIgnoreCase(cont) );

			
			
			
		}
		
		void handleTask( int op, Customer[] cusLst ) 
		{
			switch ( op ) {
			case 1:
				System.out.println( ">> CUSTOMER LIST (SORTED BY AGE)..." );
				Arrays.sort(cusLst, new AgeComparator());
				Arrays.stream(cusLst).forEach(System.out :: println);
				System.out.println();				
				break;
			case 2:
				System.out.println( ">> CUSTOMER LIST (SORTED BY DOB)..." );
				Arrays.sort(cusLst, new DobComparator());
				Arrays.stream(cusLst).forEach(System.out :: println);
				System.out.println();
				break;
			default:
				System.err.println("> Invalid key!");
				break;
			}
		}
		
	}

}
