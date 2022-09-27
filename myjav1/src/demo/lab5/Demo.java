package demo.lab5;

import java.util.Scanner;

public class Demo {

	// Scanner obj
	static Scanner scan = new Scanner(System.in);

	// Main method - stub method to be triggered at runtime
	public static void show() {

		Savings savings = new Savings();

		System.out.println( "\n>> ACCOUNT INFO..." );
		
		System.out.println("Enter initial amount: ");
		savings.balance = scan.nextDouble();
		System.out.println("Current balance: "+savings.balance);

		System.out.println( "\n>>TRANSACTION TYPE..." );
		System.out.println( "1) Deposit" );
		System.out.println( "2) Withdraw" );
		System.out.println( "\nChoose? " );

		switch ( scan.nextInt() ) {
			case 1: {
				// deposit
				System.out.println( "\nEnter deposit amount: " );
				savings.deposit( scan.nextDouble() );
				break;
			}
			case 2: {
				//withdraw
				System.out.println( "\nEnter withdraw amount: " );
				savings.withdraw( scan.nextDouble() );
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value");
		}
		System.out.println("\nNew balance: " + savings.balance);

		System.out.println("\nDone...");
		System.out.println("====================================");
	}

}

/**
 * Overloading can be applied into 1) Constructor; 2) Method
 */
class Sample {

	int i;

	// no-arg constructor
	public Sample() {
	}

	// overloaded constructor
	public Sample(int value) {
		this.i = value;
	}

	void m() {
		System.out.println("Sample class...");
	}

	// overloaded method
	void m(String greeting) {
		System.out.println(greeting + "Sample class...");
	}

	void m(int greeting) {
		System.out.println(greeting + "Sample class...");
	}

}
