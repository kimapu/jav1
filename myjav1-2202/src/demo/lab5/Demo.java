package demo.lab5;

import java.util.Scanner; 

public class Demo {

	//Scanner obj
    static Scanner scan = new Scanner(System.in);

    //Main method - stub method to be triggered at runtime
    public static void show() {

    	
    	
        System.out.println("====================================");
    }
	
}
/**
 * Overloading can be applied into
 *  	1) Constructor; 2) Method
 */
class Sample{
    
    int i;
    
    //no-arg constructor
    public Sample(){}
    
    //overloaded constructor
    public Sample( int value ){
        this.i = value;
    }
    
    void m(){
        System.out.println("Sample class...");
    }
    
    //overloaded method
    void m( String greeting ){
        System.out.println( greeting + "Sample class...");
    }
    
    void m( int greeting ){
        System.out.println( greeting + "Sample class...");
    }
    
}

