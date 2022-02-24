package demo.lab7;

import java.util.Date;

public class Loan {

	private double annualIntrestRate, loanAmount;
	private int numberOfYears;
	private Date loanDate;

	public Loan(double annualIntrestRate, double loanAmount, int numberOfYears, Date loanDate) {
		super();
		this.annualIntrestRate = annualIntrestRate;
		this.loanAmount = loanAmount;
		this.numberOfYears = numberOfYears;
		this.loanDate = loanDate;
	}

	public double getAnnualIntrestRate() {
		return annualIntrestRate;
	}

	public void setAnnualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

}
