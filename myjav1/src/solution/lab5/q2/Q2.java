package solution.lab5.q2;

import java.util.Scanner;

public class Q2 {

	static Scanner scan = new Scanner(System.in);

	static public void show() {

		String cont = null;

		do {

			System.out.println("1) Create Savings account");
			System.out.println("2) Create Checking account");
			System.out.println("Choose?");
			int option = scan.nextInt();
			handleAccount(option);
			System.out.println("\n>> Do you wanna continue? [yes/no]");
			cont = scan.next();

		} while ("yes".equalsIgnoreCase(cont));

		System.out.println("\nDone...");
		System.out.println("====================================");

	}

	static void handleAccount(int option) {
		BankAccount acc = null;
		switch (option) {
		case 1:
			System.out.println(">> Creating new Savings account is being processed.");
			acc = new Savings();
			System.out.println("Enter account number: ");
			acc.setNumber(scan.nextLong());
			System.out.println("Enter initial balance: ");
			acc.setBalance(scan.nextDouble());
			System.out.println("Enter annual interest rate: ");
			acc.setAnnualInterestRate(scan.nextDouble());
			System.out.println("\n>>INFO: " + acc);
			break;
		case 2:
			System.out.println(">> Creating new Checking account is being processed.");
			//ASSUMPTION: 10% for overdraft limit;
			acc = new Checking(0.1);
			System.out.println("Enter account number: ");
			acc.setNumber(scan.nextLong());
			System.out.println("Enter initial balance: ");
			acc.setBalance(scan.nextDouble());
			System.out.println("Enter annual interest rate: ");
			acc.setAnnualInterestRate(scan.nextDouble());
			System.out.println("\n>>INFO: " + acc);
			break;
		default:
			System.err.println("\n>>ERROR: Invalid input!");
			break;
		}
		handleTransaction(acc);
	}

	static void handleTransaction(BankAccount acc) {
		System.out.println("\n>Select Transaction type...");
		System.out.println("1) Deposit");
		System.out.println("2) Withdraw");
		int sel = scan.nextInt();
		System.out.println("Enter amount: ");
		double amt = scan.nextDouble();
		if (sel == 1) {
			//deposit
			acc.deposit(amt);
		}
		if (sel == 2) {
			//withdraw
			acc.withdraw(amt);
		}
		System.out.println("\n>>INFO: "+ acc);
	}
}
