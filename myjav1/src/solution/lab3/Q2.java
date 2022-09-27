package solution.lab3;

import java.util.Arrays;
import java.util.Scanner;

class Triangle {
	int[] sides;
	private long perimeter;

	public Triangle(int[] sides) throws Exception{
		super();
		boolean valid = false;
		if( sides.length > 0) {
			valid = ((sides[0] > sides[1]) & (sides[0] > sides[2])) && 
					((sides[1] > sides[2]) & (sides[0] > sides[2])) || 
					((sides[2] > sides[0]) & (sides[2] > sides[1])) ;
		}
		if( valid ) setEdge(sides); else throw new Exception("Invalid!");
	}

	public int[] getEdge() {
		return sides;
	}

	public void setEdge(int[] edge) {
		if( edge.length > 0 ) {
			this.sides = edge;
			perimeter = Arrays.stream(edge).sum();
		}
		
	}
	
	public long getPerimeter() {
		return perimeter;
	}

}

public class Q2 {

	static private final int EDGE_SIZE = 3;

	static Scanner scan = new Scanner(System.in);

	static public void show() {
		int[] edge = new int[EDGE_SIZE];

		System.out.println("Enter " + EDGE_SIZE + " edges of a traingle: ");
		System.out.println(">>> Edge 1:");
		edge[0] = scan.nextInt();
		System.out.println(">>> Edge 2:");
		edge[1] = scan.nextInt();
		System.out.println(">>> Edge 3:");
		edge[2] = scan.nextInt();
		
		Triangle shape;
		try {
			shape = new Triangle( edge );
			long perimeter = shape.getPerimeter();
			System.out.println( "Traingle's perimeter: "+ perimeter );
		} catch (Exception e) {
			System.out.println( e.getMessage() );
		}
		System.out.println("====================================");
		
	}

}
