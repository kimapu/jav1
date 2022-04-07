package solution.lab7.q3;

public class Calculator {

	private String n1, n2;

	public Calculator(String n1, String n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public double add() {
		
		try {
			return Double.parseDouble(n1) + Double.parseDouble(n2);
		} catch (NumberFormatException e) {
			System.err.println( e.getMessage() );
			return 0;
		}
		
	}

	public double sub() {

		try {
			return Double.parseDouble(n1) - Double.parseDouble(n2);
		} catch (NumberFormatException e) {
			System.err.println( e.getMessage() );
			return 0;
		}
		
	}

	public double mul() {

		try {
			return Double.parseDouble(n1) * Double.parseDouble(n2);
		} catch (NumberFormatException e) {
			System.err.println( e.getMessage() );
			return 0;
		}
		
	}

	public double div() {

		try {
			return Integer.parseInt(n1) / Integer.parseInt(n2);
		} catch (NumberFormatException | ArithmeticException e) {
			System.err.println( e.getMessage() );
			return 0;
		} 
		
	}

}
