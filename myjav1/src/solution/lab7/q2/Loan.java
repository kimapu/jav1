package solution.lab7.q2;

import java.util.Date;

public class Loan {

	private double annualIntrestRate, loanAmount;
	private int numberOfYears;
	private Date loanDate;

	public Loan(double annualIntrestRate, double loanAmount, int numberOfYears, Date loanDate) {
		super();
		if( loanAmount < 0 || annualIntrestRate < 0 || numberOfYears < 0) 
		{
			throw new IllegalArgumentException("> Negetive value found!");
		}
		this.annualIntrestRate = annualIntrestRate;
		this.loanAmount = loanAmount;
		this.numberOfYears = numberOfYears;
		this.loanDate = loanDate;
	}

	public double getAnnualIntrestRate() {
		return annualIntrestRate;
	}

	public void setAnnualIntrestRate(double annualIntrestRate) {
		if( annualIntrestRate < 0) 
		{
			throw new IllegalArgumentException("> Negetive value found!");
		}
		this.annualIntrestRate = annualIntrestRate;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		if( loanAmount < 0 ) 
		{
			throw new IllegalArgumentException("> Negetive value found!");
		}
		this.loanAmount = loanAmount;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		if( numberOfYears < 0) 
		{
			throw new IllegalArgumentException("> Negetive value found!");
		}
		this.numberOfYears = numberOfYears;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	@Override
	public String toString() {
		return "Loan [annualIntrestRate=" + annualIntrestRate + ", loanAmount=" + loanAmount + ", numberOfYears="
				+ numberOfYears + ", loanDate=" + loanDate + "]";
	}
	
	
}
