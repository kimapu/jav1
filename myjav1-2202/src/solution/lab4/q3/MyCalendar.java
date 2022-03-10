package solution.lab4.q3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {

	private final Calendar cal = GregorianCalendar.getInstance();
	private int year, month, date;
	
	public MyCalendar() {
		this.year = cal.get(GregorianCalendar.YEAR);
		this.month = cal.get(GregorianCalendar.MONTH)+1;
		this.date = cal.get(GregorianCalendar.DATE);
	}

	@Override
	public String toString() {
		return "Today: "+ String.join("/", 
				String.valueOf(date),
				String.valueOf(month),
				String.valueOf(year)
				);
	}
	
	

}
