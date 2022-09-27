package solution.lab4.q4;

import java.util.Calendar;

public class Time {

	private int hour, minute, second;
	
	public Time() {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		this.hour = cal.get(Calendar.HOUR);
		this.minute = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
	}

	@Override
	public String toString() {
		return "Now: "+ String.join(":", 
				String.valueOf(hour),
				String.valueOf(minute),
				String.valueOf(second)
				);
	}

}
