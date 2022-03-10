package solution.lab4.q3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Q3 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {

		try {
			
			for (int i = 0; i < 3; i++) {
				System.out.println( new MyCalendar() );
				TimeUnit.SECONDS.sleep(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("====================================");
	}
}
