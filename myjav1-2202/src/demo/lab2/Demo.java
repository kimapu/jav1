package demo.lab2;

import java.util.Scanner; 

public class Demo {


	//Scanner obj
    static Scanner scan = new Scanner(System.in);

    //Main method - stub method to be triggered at runtime
    public static void show() {

    	//prompt the user
        System.out.println("Enter feet: ");
        int feetValue = scan.nextInt();//capture the user input and then convert to int

        //compute
        double meterValue = feetValue * 0.305;

        //display
        System.out.println(">>> Meter: " + meterValue);
        System.out.println("====================================");
        
    }
	
}
