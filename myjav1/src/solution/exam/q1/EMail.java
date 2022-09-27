package solution.exam.q1;

import java.util.Arrays;

public class EMail extends Document {

	private String subject;
	private String[] to;
	
	public EMail() {
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public String[] getTo() {
		return to;
	}

	@Override
	public String toString() {
		return "EMail [subject=" + subject + ", to=" + Arrays.toString(to) + ", toString()=" + super.toString() + "]";
	}	
	
}
