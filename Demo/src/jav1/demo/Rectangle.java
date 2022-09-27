package jav1.demo;

/* class definition */
public class Rectangle 
{	
	/* data member - data property */
	/* OOP: Encapsulation */
	/* 4 modifiers: 
	 * public, private, protected, package-private (by default) */
	int width, length; // instance member -  BELONG TO OBJECT
	static int counter; // static member - BELONG TO CLASS

	/* constructor method - creates object */
	/* Usage: Initialise instance variables if any */

	/* by default - no-arg constructor is provided FOC */
	public Rectangle() {
		System.out.println( "default constructor called..." );
		width = 0;
		length = 0;
	}
	
	/* more flexible! - overloading constructor for object creation */
	public Rectangle(int width, int length)
	{
		this.width = width; //local variable/param
		this.length = length;
	}
	
	/* operation member - computing area */
	int computeArea()
	{
		return width * length;
	}	
	
}
