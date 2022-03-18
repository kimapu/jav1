package demo.lect.abstr;

public class App {

	public static void main(String[] args) {

		Shape s1 = new Triangle(); 
		s1.draw(); //what would it be drawn?
		
	}
}

/**
 * Abstraction 
 * 	- abstract class
 * 	- abstract method
 */
abstract class Shape
{
	abstract void draw(); //incomplete operation... waiting to be completed by concrete class
}

class Triangle extends Shape
{

	@Override
	void draw() {
		//logically drawing a Triangle shape
		System.out.println( ">> drawing Trangle object..." );
	}
	
}

class Rectangle extends Shape
{

	@Override
	void draw() {
		//logically drawing a Rectangle shape	
	}
	
}



