package solution.lab5.q1;

public class PartTimer extends Staff {

	final private double RATE_PER_HOUR = 5;
	
	private int workHrs;

	public PartTimer(int workHrs) {
		super();
		this.workHrs = workHrs;
		super.setSalary(workHrs*RATE_PER_HOUR);
	}

	@Override
	public String toString() {
		return "PartTimer [workHrs=" + workHrs + ", toString()=" + super.toString() + "]";
	}

	
	
}
