package solution.lab5.q1;

import java.util.Calendar;

public class MyDate {

	private int year, month, day;
	
	public MyDate() {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		this.day = cal.get(Calendar.DATE);
		this.month = cal.get(Calendar.MONDAY)+1;
		this.year = cal.get(Calendar.YEAR);
	}

	@Override
	public String toString() {
		return String.join("/", String.valueOf(day), String.valueOf(month), String.valueOf(year));
	}
}
