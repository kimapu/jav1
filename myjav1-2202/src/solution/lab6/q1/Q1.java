package solution.lab6.q1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q1 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {

		String cont = "";
		do {
			
			System.out.println( "1) 10 strings" );
			System.out.println( "2) 10 integers" );
			System.out.println( "3) 10 dates" );
			System.out.println( "Find largest?" );
			
			handleTask( scan.nextInt() );
			
			System.out.println("\n>> Do you wanna continue? [yes/no]");
			cont = scan.next();

		} while ( "yes".equalsIgnoreCase(cont) );

		System.out.println( "\nDone..." );	
		System.out.println("====================================");
	}

	static void handleTask(int op)
	{
		System.out.println( ">> handling task"+op+"..." );
		switch (op) {
		case 1:
		{			
			String[] str10 = {"j","d","c","i","g","h","b","f","a","e"};
			System.out.print( Arrays.stream(str10).collect(Collectors.toList()));
			System.out.println( " -> Max string: "+ Utils.max(str10) );
			break;
		}
		case 2:
		{
			Integer[] int10 = {66,55,22,77,44,99,55,88,11,87};
			System.out.print( Arrays.stream(int10).collect(Collectors.toList()));
			System.out.println( " -> Max integer: "+ Utils.max(int10) );			
			break;
		}
		case 3:
		{
			LocalDate[] date10 = new LocalDate[10];
			for (int i = 0; i < date10.length; i++) {
				date10[i] = LocalDate.now().plusMonths(i);
			}
			System.out.print( Arrays.stream(date10).collect(Collectors.toList()));
			System.out.println( " -> Max date: "+ Utils.max(date10) );
			break;
		}
		default:
			break;
		}
	}
	
	
}
