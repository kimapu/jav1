package solution.lab5.q1;

public class Employee extends Person {

	private String office;
	private double salary;
	private MyDate dateHired;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + ", toString()="
				+ super.toString() + "]";
	}

	

}
