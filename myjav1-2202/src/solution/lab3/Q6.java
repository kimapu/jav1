package solution.lab3;

import java.util.Scanner;

public class Q6 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {
		
		double tuitionFee = 10000;
		double rate = 0.05;
		
		int year = 10;
		System.out.println( "Current tuition fee: RM"+ tuitionFee );
		for (int i = 0; i < year; i++) {
			tuitionFee += (tuitionFee*rate);
			System.out.printf( "Tuition fee in year %d is RM%.2f\n", (i+1), tuitionFee );
		}
		System.out.println("====================================");
		
	}
}
