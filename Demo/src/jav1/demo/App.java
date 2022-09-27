package jav1.demo;

public class App {

	public static void main(String[] args) {
		
		int shapeCount = Rectangle.counter;
		
		var i = 10;
		/* object instantiation */
		Rectangle r1 = new Rectangle();
		r1.length = i;
		r1.width = 5;
		int length_for_r1 = r1.length;
		
		System.out.println( "Area r1 = " + r1.computeArea() );
		/* object instantiation */
		/* Local Variable Inference Type */
		var r2 = new Rectangle();
		r2.length = 20;
		r2.width = i;
		System.out.println( "Area r2 = " + r2.computeArea() );
		
		/* object instantiation */
		var r3 = new Rectangle(10, 10); //invoking overloaded constructor
		
	}

}
