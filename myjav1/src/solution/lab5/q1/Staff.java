package solution.lab5.q1;

public class Staff extends Employee {

	private String title;
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Staff [title=" + title + ", toString()=" + super.toString() + "]";
	}
	
	

}
