package solution.lab5.q1;

public class Student extends Person {

	final private StudentStatus status;

	public Student(StudentStatus status) {
		super();
		this.status = status;
	}

	public StudentStatus getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Student [status=" + status + ", toString()=" + super.toString() + "]";
	}

	
	
}
