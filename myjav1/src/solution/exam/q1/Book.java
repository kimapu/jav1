package solution.exam.q1;

public class Book extends Document {

	private String title;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", toString()=" + super.toString() + "]";
	}
	
}
