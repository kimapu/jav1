package demo.lab7;

import java.util.Random;

public class Demo {
	
	static int[] arr = new int[100];
	
    public static void show() {

    	a();
    	
    	System.out.println();
    	
    	b();
    	
		System.out.println("\nDone...");
		System.out.println("====================================");
    }
    
    static void a()
    {
    	
    	for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.abs(new Random().nextInt());
		}
    	System.out.println( "> Array with 100 elements, initialised randomly!" );
    	
    }
    
    static void b()
    {
    	int index = 101; //101 is out of range of the array's capacity 
    	
    	//Causing ArrayIndexOutOfBounds exception - unhandled!
//    	for (int i = 0; i < index; i++) 
//    	{
//			System.out.println( arr[i] );
//		}
    	
    	//To handle it!
    	try {
        	for (int i = 0; i < index; i++) {
    			System.out.println( arr[i] );
    		}	
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println( "> Out of bound!" );
		}
    }
    
}
