package solution.lab5.q2;

public class Savings extends BankAccount {

	public Savings() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double withdraw(double amount) {
		if ( amount < super.balance ) {
			return super.withdraw(amount);
		} else {
			System.err.println( ">>> Insufficient fund!" );
			return super.balance;
		}
	}

	@Override
	public String toString() {
		return "Savings [toString()=" + super.toString() + "]";
	}
	
}
