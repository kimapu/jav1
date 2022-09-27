package solution.lab5.q2;

public class Checking extends BankAccount {

	//overdraft limit
	private double limit;

	public Checking(double limit) {
		super();
		this.limit = limit;
	}

	@Override
	public double withdraw(double amount) {
		double totalAmount = super.balance + (super.balance * this.limit);
		if ( amount < totalAmount ) {
			return super.withdraw(amount);
		} else {
			System.err.println( ">>> Insufficient fund!" );
			return super.balance;
		}
	}

	@Override
	public String toString() {
		return "Checking [limit=" + limit + ", toString()=" + super.toString() + "]";
	}	
	
}
