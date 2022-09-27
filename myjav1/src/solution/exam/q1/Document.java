package solution.exam.q1;

import java.util.Arrays;
import java.util.Date;

public class Document {

	private String[] authors;
	private Date date;
	
	public Document() {
		// TODO Auto-generated constructor stub
	}

	public String[] getAuthors() {
		return authors;
	}

	public void addAuthors(String name) { }

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Document [authors=" + Arrays.toString(authors) + ", date=" + date + "]";
	}	

}
