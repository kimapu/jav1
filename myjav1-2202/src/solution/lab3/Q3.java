package solution.lab3;

import java.util.Scanner;

class MyCal
{

	public static int day( String month ) 
	{
		int day = 0;
		switch (month.toLowerCase()) {
			case "jan":
			case "mar":
			case "may":
			case "jul":
			case "aug":
			case "oct":
			case "dec":
				day = 31;
				break;
			case "feb": 
				day = 28;
				break;
			case "apr":
			case "jun":
			case "sep":
			case "nov":
				day = 30;
				break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
		}
		return day;
	}
	
}

public class Q3 {

	static Scanner scan = new Scanner(System.in);

	static public void show() {
		
		System.out.println( "Enter year: " );
		int yr = scan.nextInt();
		System.out.println( "Enter month in word: " );
		String mth = scan.next();
		
		int day = MyCal.day( mth.substring(0, 3) );

		System.out.println( mth+ " has " + day + " days." );
		System.out.println("====================================");
	}
}
