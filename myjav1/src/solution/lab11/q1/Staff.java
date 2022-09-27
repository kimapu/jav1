package solution.lab11.q1;

public class Staff {

	public Staff() {
		// TODO Auto-generated constructor stub
	}
	
	public Staff(String id, String fname, String lname, String age, String dob, String department, String dateJoined) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.dob = dob;
		this.department = department;
		this.dateJoined = dateJoined;
	}



	private String id, fname, lname, age, dob, department, dateJoined;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(String dateJoined) {
		this.dateJoined = dateJoined;
	}

	@Override
	public String toString() {
		return String.join("|", id, fname, lname, age, dob, department, dateJoined);
	}
	
}
