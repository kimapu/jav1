package solution.lab4.q4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Q4 {

	static Scanner scan = new Scanner(System.in);
	static public void show() {

		try {
			
			for (int i = 0; i < 10; i++) {
				System.out.println( new Time() );
				TimeUnit.SECONDS.sleep(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("====================================");
	}
}
