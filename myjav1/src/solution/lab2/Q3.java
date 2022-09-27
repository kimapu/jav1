package solution.lab2;

import java.util.Scanner;

/**
 * 
 * @author kimlee
 *
 */

public class Q3 {

	//instantiate a new Scanner object
    static Scanner scan = new Scanner( System.in );
   
	public static void show() {
		System.out.println("Enter a number: ");
        int n = scan.nextInt();

        //chk 0-1000
        if (n > 0 && n < 1000) {
            //find the sum of digit
            System.out.println("Sum of digits: " + sumOfDigit(n));
        } else {
            System.out.println("Invalid input: number is between 0 and 1000");
        }
        System.out.println("====================================");
	}

	static int sumOfDigit(int n) {
        int temp, sum = 0;
        while (n > 0) {
            temp = n % 10;
            sum = sum + temp;
            n = n / 10;
        }
        return sum;
    }
	
}
