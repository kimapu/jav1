package solution.lab4.q5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import solution.lab4.q4.Time;

public class Q5 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {

		Time[] times = new Time[5];
		try {
			
			for (int i = 0; i < times.length; i++) {
				System.out.println( ">> Loading ("+(i+1)+")..." );
				times[i] = new Time();
				TimeUnit.SECONDS.sleep(5);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println( ">> OUTPUT --------------" );
			Arrays.stream(times).forEach(System.out :: println );
		}

		System.out.println("====================================");
	}
}