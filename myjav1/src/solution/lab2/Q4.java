package solution.lab2;

import java.util.Scanner;

/**
 * 
 * @author kimlee
 *
 */

public class Q4 {

	static Scanner scan = new Scanner(System.in);

	public static void show() {

		System.out.println("Enter a sentence in UPPERCASE: ");
		String sentence = scan.nextLine();

		String toLower = sentence.toLowerCase();

		System.out.println("You just typed in: " + toLower);

		System.out.println("====================================");
		
	}

}
