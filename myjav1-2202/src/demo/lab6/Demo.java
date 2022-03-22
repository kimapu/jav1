package demo.lab6;

public class Demo {

    //For the class diagram provided, a very-general diagram (analysis)
        //OOP concepts applied: abstraction and polymorphism and inhertiance
    
    //To be completed, we can add "Encapsulation" for the data attr
    
    
    public static void show() {
        
        //object instantiation...
        FullTimer ft = new FullTimer(); //no-arg constructor method call
        ft.setWorkload(20);
        ft.calcSalary();
        System.out.println( "FullTimer's pay: " + ft.getSalary() );
        
        PartTimer pt = new PartTimer(12);
        pt.calcSalary();
        System.out.println( "PartTimer's pay: " + pt.getSalary() );

		System.out.println("\nDone...");
		System.out.println("====================================");
    }
    
}
