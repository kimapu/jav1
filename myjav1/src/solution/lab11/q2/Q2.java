package solution.lab11.q2;

import java.util.Scanner;

import solution.lab11.Constant;

public class Q2 {

	static Scanner scan = new Scanner(System.in);
	public static void show() {

		CustomerDA dao = new CustomerDA(Constant.PATH_FILE);
		
		System.out.println( "Enter username: " );
		String usr = scan.next();
		System.out.println( "Enter password: " );
		String pwd = scan.next();

		Customer c1 = dao.findByUsername(usr);
		if(c1 != null)
		{
			String password = c1.getPassword();
			if( pwd.equals(password))
				System.out.println("\n> username and password verified!\n\n");
			else
				System.err.println("\n> username not found!\n");
		}
		
	}

}
