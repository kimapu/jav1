package solution.lab5.q3;

public class Circle extends GeometricObject {

	public Circle(double radius) {
		super(radius);
	}

	public double computeArea() 
	{
		return Math.PI * Math.pow(super.radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [toString()=" + super.toString() + "]";
	}
	
}
