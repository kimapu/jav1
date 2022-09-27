package solution.lab7.q2;

import java.util.Date;
import java.util.Scanner;

public class Q2 {

	static Scanner scan = new Scanner(System.in);

	static public void show() {

		//Test1
//		solution.lab7.q2.Loan loan1 = new solution.lab7.q2.Loan(-9, 0, 0, new Date());
//		System.out.println( loan1 );
		
		//Test2
//		solution.lab7.q2.Loan loan2 = new solution.lab7.q2.Loan(10, 10, 10, new Date());
//		loan2.setNumberOfYears(-1);
//		System.out.println( loan2 );
		
		//Test3-trycatch!
		try {
			solution.lab7.q2.Loan loan3 = new solution.lab7.q2.Loan(10, 10, -1, new Date());
			System.out.println( loan3 );
		} catch (Exception e) {
			System.err.println( e.getMessage() );
		}
		
		
		System.out.println("\nDone...");
		System.out.println("====================================");
	}
}