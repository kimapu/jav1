package solution.lab5.q2;

public class BankAccount {

	protected long number;
	protected double balance;
	protected double annualInterestRate;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public double deposit( double amount ) {
		this.balance += amount;
		return balance;
	}

	public double withdraw( double amount ) {
		this.balance -= amount;
		return balance;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	@Override
	public String toString() {
		return "BankAccount [number=" + number + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
				+ "]";
	}
	
	
}
