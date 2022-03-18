package demo.lect.javinterface;

public class App {

	public static void main(String[] args) {

		/**
		 * Student is-a-kind-of Person object
		 * Student is-a-kind-of Accessable object
		 * Student is-a-kind-of Student
		 */
		Student s1 = new Student();
		System.out.println( s1 instanceof Person );
		System.out.println( s1 instanceof Accessable  );
		System.out.println( s1 instanceof Student );
		System.out.println( s1 instanceof Comparable );
		
	}

}

/**
 * Multiple inheritance
 */

interface Accessable
{
	Object get();
}

interface Removable
{
	int i = 100; //by default, public static final
	void delete(); //by default, public abstract
}

/**
 * Student is-a-kind-of Person object
 * Student is-a-kind-of Accessable object
 * Student is-a-kind-of Student
 */
class Student extends Person implements Accessable, Comparable
{

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Person
{
	
}

class MyIO implements Accessable, Removable
{

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

