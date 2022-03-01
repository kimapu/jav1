package demo.lab4;

import java.util.Scanner;

public class Demo {

	static Scanner scan = new Scanner(System.in);
	public void show(String[] args) {
		 
        //object Account acc1
        Account.setType("Savings");
        
        Account acc2 = new Account(); //instantiating object
        //acc2.id = 1333;
        acc2.setId(1333);
        
        Account acc3 = new Account(); //instantiating object
        
        Account acc1 = new Account(); //instantiating object
        acc1.setId(1222);
        acc1.setBalance(20000);
        acc1.setAnnualInterestRate(0.03);
        
        System.out.println( "Balance: " + acc1.getBalance() );
        System.out.println("Deposit? ");
        acc1.deposit( scan.nextDouble() );
        
        System.out.println( acc1 );
        System.out.println( "ID: " + acc1.getId() );
        System.out.println( "Balance: " + acc1.getBalance() );
	}

}
