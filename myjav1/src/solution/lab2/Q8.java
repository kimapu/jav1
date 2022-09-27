package solution.lab2;

import java.util.Scanner;

class Investment{
	double amount, annualInterestRate;
	int year;
	
	private double futureinvestmentValue;

	public Investment(double amount, double annualInterestRate, int year) {
		super();
		this.amount = amount;
		this.annualInterestRate = annualInterestRate;
		this.year = year;
	}

	public double getFutureinvestmentValue() {
		return futureinvestmentValue;
	}
	
	public void compute() {
		System.out.println( ">> Computing..." );
		this.futureinvestmentValue = amount * Math.pow((1+(annualInterestRate/12)), (year*12));
	}
	
}

public class Q8 {

	static Scanner scan = new Scanner(System.in);
	
	public static void show() {
		
		System.out.println("Enter Investment amount: ");
		double amt = scan.nextDouble();
		System.out.println("Enter Annual interest [%]: ");
		double rate = scan.nextDouble() / 100;
		System.out.println("Enter No. of years: ");
		int yr = scan.nextInt();
		
		Investment calc = new Investment(amt, rate, yr);
		calc.compute();
		
		double fiv = calc.getFutureinvestmentValue();
		
		System.out.printf( ">> Your future investment value: $%.2f\n", fiv );
		System.out.println("====================================");

		
	}

}
