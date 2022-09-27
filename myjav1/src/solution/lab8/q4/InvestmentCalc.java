package solution.lab8.q4;

import java.text.DecimalFormat;

public class InvestmentCalc {

	private final double amount, annualInterestRate;
	private final int year;
	
	private double futureinvestmentValue;

	public InvestmentCalc(double amount, double annualInterestRate, int year) {
		super();
		this.amount = amount;
		this.annualInterestRate = annualInterestRate /100;
		this.year = year;
	}

	public String getFutureinvestmentValue() {
		DecimalFormat df = new DecimalFormat("##.##");
		return df.format(futureinvestmentValue);
	}
	
	public void compute() {
		System.out.println( ">> Computing..." );
		this.futureinvestmentValue = amount * Math.pow((1+(annualInterestRate/12)), (year*12));
	}
}
