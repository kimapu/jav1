package solution.lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q5 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {
		
		Random rand = new Random();
		
		//assume that, array of random numbers between 0 and 9.
		int[] arr = new int[100];;
		int upperbound = 10;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(upperbound);
		}
		System.out.println( ">> Array created!" );
		
		//display
		System.out.println( Arrays.stream(arr).boxed().collect(Collectors.toList()) );
		//sum
		System.out.println( "\nSum: "+ sum(arr) );
		System.out.println("====================================");
	}
	
	static int sum( int[] arr ) {
		int sum = 0;
		for (int i : arr) {
			sum+=i;
		}
		return sum;
	}
}
