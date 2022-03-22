package solution.lab5.q1;

public class FullTimer extends Staff {

	final private double FIXED_SALARY = 1500;
	
	public FullTimer() {
		super.setSalary(FIXED_SALARY);
	}

	@Override
	public String toString() {
		return "FullTimer [toString()=" + super.toString() + "]";
	}

	
}
