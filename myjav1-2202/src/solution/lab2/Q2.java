package solution.lab2;

import java.util.Scanner;

/**
 * 
 * @author kimlee
 *
 */

class Cynlinder {

    //data
    int radius, length;
    
    //operation
    //area() and volume()
    double area(){
        return radius * radius * Math.PI;
    }
    
    double volume(){
        return area() * length;
    }
    
}

public class Q2 {

	 //instantiate a new Scanner object
    static Scanner scan = new Scanner( System.in );
   
   //shorthand- psvm->Tab
   //Main method
   public static void show() {
       
       //sout->Tab
       System.out.println("");
       
       System.out.println( "CYLINDER PROPERTIES >>>" );
       int radius, length;
       
       //input
       System.out.println( "Enter radius: " );
       radius = scan.nextInt();
       System.out.println( "Enter length: " );
       length = scan.nextInt();
       
       //compute
       //double area = radius * radius * Math.PI;
       //double volume = area * length;
       
       //modified version to use Object/Class
       Cynlinder c1 = new Cynlinder();
       //set to object 
       c1.radius = radius;
       c1.length = length;
       double volume = c1.volume();
       
       //display
       System.out.println( "\nVolume of Cynlinder: "+ volume );
       System.out.println("====================================");
   }
	
}
