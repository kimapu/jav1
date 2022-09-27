package solution.lab3;

import java.util.Scanner;

class Grader
{
	
	public static String[] get( int marks ) 
	{
		String[] grade = new String[3];
		grade[0] = String.valueOf(marks);
		if ( marks >= 80 ) {
			grade[1] = "A+";
			grade[2] = "Distinction";
 		} else if( marks >= 75 ) {
 			grade[1] = "A";
			grade[2] = "Distinction";
		} else if( marks >= 70 ) {
 			grade[1] = "B+";
			grade[2] = "Credit";
		} else if( marks >= 65 ) {
 			grade[1] = "B";
			grade[2] = "Credit";
		} else if( marks >= 55 ) {
 			grade[1] = "C";
			grade[2] = "Pass";
		} else if( marks >= 50 ) {
 			grade[1] = "D";
			grade[2] = "Pass";
		} else if( marks >= 40 ) {
 			grade[1] = "F+";
			grade[2] = "Marginal Fail";
		} else {
 			grade[1] = "F";
			grade[2] = "Fail";
		}
		return grade;
	}
	
}

public class Q4 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {
		
		System.out.println( "Enter marks: " );
		int marks = scan.nextInt();
		
		String[] grade = Grader.get( marks );
		if ( grade.length > 0 ) {
			System.out.print( "Marks: "+ grade[0]+ " : " );
			System.out.print( "Grade: "+ grade[1]+ " : " );
			System.out.println( "Description: "+ grade[2] );
		} else {
			System.out.println( ">> ERROR: No marks!" );
		}
		System.out.println("====================================");
	}
}