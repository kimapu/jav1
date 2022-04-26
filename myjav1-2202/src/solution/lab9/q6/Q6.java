package solution.lab9.q6;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q6 {

	static Scanner scan = new Scanner(System.in);
	public static void show() {

		System.out.println( "> Creating Circle object..." );
		System.out.println( "How many Circle object to create? " );
		int count = scan.nextInt();

		List<Circle> circleLst = new LinkedList<>();
		for (int i = 0; i < count; i++) {
			System.out.println( "Enter radius of Circle "+ (i+1)+": " );
			int r = scan.nextInt();
			circleLst.add(new Circle(r));
		}

		System.out.println( "\n> Circle listing..." );
		System.out.println( circleLst );
		
		System.out.println( "\n> Circle listing [sort by area]..." );
		Collections.sort(circleLst, new SortByArea());
		System.out.println( circleLst );
		
		
		System.out.println();
		System.out.println("====================================");
	}

}

class Circle{
	int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area()=" + area() + "]";
	}
}

class SortByArea implements Comparator<Circle>
{
	@Override
	public int compare(Circle o1, Circle o2) {
		return (o1.area() > o2.area()) ? 1 : (o1.area() < o2.area()) ? -1 : 0;
	}
}
