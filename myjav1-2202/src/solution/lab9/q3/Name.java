package solution.lab9.q3;

public class Name {
	
	private final String firstName, lastName;
	private String fullName;
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = String.join(" ", firstName, lastName);
	}

	public String getFullName() {
		return fullName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + ", fullName=" + fullName + "]";
	}

}
