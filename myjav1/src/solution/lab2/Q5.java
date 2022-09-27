package solution.lab2;

import java.util.Scanner;

/**
 * 
 * @author kimlee
 *
 */

public class Q5 {

	static Scanner scan = new Scanner(System.in);

    public static void show() {
        System.out.println("Enter a number from 0 - 128 : ");
        int number = scan.nextInt();
        
        if ( !(number > 0 && number < 128) ) {
            System.out.println( "Input error, please try again!" );
        } else {
            System.out.println(number + ": " + (char) number);

        }

        System.out.println("====================================");
    }
	
}
