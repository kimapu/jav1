package solution.lab5.q1;

public class Faculty extends Employee {
	
	private String from, to;
	private String rank;
	
	public Faculty() {
		// TODO Auto-generated constructor stub
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Faculty [from=" + from + ", to=" + to + ", rank=" + rank + ", toString()=" + super.toString() + "]";
	}


}
