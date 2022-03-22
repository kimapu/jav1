package solution.lab5.q1;

import java.util.Scanner;

public class Q1 {


	static Scanner scan = new Scanner(System.in);
	static public void show() {

		String cont = null;
		
		do {
			
			System.out.println( "1) Create Student object" );
			System.out.println( "2) Create Faculty object" );
			System.out.println( "3) Create FullTimer object" );
			System.out.println( "4) Create PartTimer object" );
			System.out.println( "Choose?" );
			int option = scan.nextInt();
			handleTask( option );
			System.out.println( "\n>> Do you wanna continue? [yes/no]" );
			cont = scan.next();
			
		} while ( "yes".equalsIgnoreCase(cont) );
		System.out.println("\nDone...");
		System.out.println("====================================");
	}
	
	static void handleTask( int op )
	{
		switch (op) {
		case 1:
			Person student1 = new Student(StudentStatus.JUNIOR);
			student1.setName("John Mellor");
			student1.setEmail("john@email.edu.my");
			student1.setPhoneNo("+6121234567");
			student1.setAddr("TPM, KL, Malaysia");
			System.out.println( student1 );
			break;
		case 2:
			Faculty faculty1 = new Faculty();
			faculty1.setName("John Mellor");
			faculty1.setEmail("john@email.edu.my");
			faculty1.setPhoneNo("+6121234567");
			faculty1.setAddr("TPM, KL, Malaysia");
			faculty1.setDateHired( new MyDate() );
			faculty1.setOffice("Technology Park Malaysia");
			faculty1.setRank("CEO");
			faculty1.setSalary(20000);
			faculty1.setFrom("0900");
			faculty1.setTo("1800");
			System.out.println( faculty1 );
			break;
		case 3:
			Staff ftmr = new FullTimer();
			ftmr.setName("John Mellor");
			ftmr.setEmail("john@email.edu.my");
			ftmr.setPhoneNo("+6121234567");
			ftmr.setAddr("TPM, KL, Malaysia");
			ftmr.setDateHired( new MyDate() );
			ftmr.setOffice("Technology Park Malaysia");
			ftmr.setSalary(20000);
			ftmr.setTitle("Director");
			System.out.println( ftmr );
			break;
		case 4:
			Staff ptmr = new PartTimer(22);
			ptmr.setName("John Mellor");
			ptmr.setEmail("john@email.edu.my");
			ptmr.setPhoneNo("+6121234567");
			ptmr.setAddr("TPM, KL, Malaysia");
			ptmr.setDateHired( new MyDate() );
			ptmr.setOffice("Technology Park Malaysia");
			System.out.println( ptmr );
			break;
		default:
			System.out.println( "\n>>> Invalid input!" );
			break;
		}
	}
	
	public static void main(String[] args) {
		show();
	}
	
}
