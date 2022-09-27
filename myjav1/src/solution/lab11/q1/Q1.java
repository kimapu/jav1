package solution.lab11.q1;

import java.util.List;
import java.util.Scanner;

import solution.lab11.Constant;

public class Q1 {

	static Scanner scan = new Scanner(System.in);
	public static void show() {
		
		Staff s1 = new Staff();
		
		StaffDA dao = new StaffDA(Constant.PATH_FILE);

		String cont;
		do {

			System.out.println("\n> --- STAFF INFORMATION CONSOLE---");
			System.out.println("1) View All");
			System.out.println("2) Insert Staff");
			System.out.println("3) Update Staff");
		
			System.out.println("Choose? ");
			int opt = scan.nextInt();
			switch ( opt ) {
			case 1: {
				
				try {
					List<Staff> staffLst = dao.view();
					System.out.println("\n-------------------------------");
					staffLst.forEach( System.out :: println );
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
			}
			case 2: {
				
				try {
					System.out.println( "Enter first name: " );
					s1.setFname(scan.next());
					System.out.println( "Enter last name: " );
					s1.setLname(scan.next());
					System.out.println( "Enter age: " );
					s1.setAge(scan.next());
					System.out.println( "Enter date of birth [DD/MM/YYYY]: " );
					s1.setDob(scan.next());
					System.out.println( "Enter department: " );
					s1.setDepartment(scan.next());
					System.out.println( "Enter date joined [DD/MM/YYYY]: " );
					s1.setDateJoined(scan.next());
					
					//addNew
					int row = dao.insert( s1 );
					
					if ( row > 0 ) {
						System.out.println( "\n> Staff is added successfully!" );
					} else {
						System.err.println( "\n> Staff is not added!" );
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
			}
			case 3: {
				System.out.println( "Enter Staff ID: " );
				String id = scan.next();
				System.out.println( "Enter first name: " );
				s1.setFname(scan.next());
				System.out.println( "Enter last name: " );
				s1.setLname(scan.next());
				System.out.println( "Enter age: " );
				s1.setAge(scan.next());
				System.out.println( "Enter date of birth [DD/MM/YYYY]: " );
				s1.setDob(scan.next());
				System.out.println( "Enter department: " );
				s1.setDepartment(scan.next());
				System.out.println( "Enter date joined [DD/MM/YYYY]: " );
				s1.setDateJoined(scan.next());
				
				
				int row = dao.update(id, s1);

				if ( row > 0 ) {
					System.out.println( "\n> Staff is updated successfully!" );
				} else {
					System.out.println( "\n> Staff ID not found!" );
				}
				
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opt);
			}
			
			System.out.println("\n\n>> Continue [yes/no]? ");
			cont = scan.next();
		} while ( cont.equalsIgnoreCase("yes") );
		System.out.println("\n\n-------------------------------");
		System.out.println( "> Thank you!" );


	}

}
