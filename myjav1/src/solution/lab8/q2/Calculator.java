package solution.lab8.q2;

public class Calculator {

	private final long num1, num2;

	public Calculator(long num1, long num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public long add() {
		return num1 + num2;
	}

	public long sub() {
		return num1 - num2;
	}
	
	public long mul() {
		return num1 * num2;
	}

	public long div() {
		return num1 / num2;
	}
	
}
