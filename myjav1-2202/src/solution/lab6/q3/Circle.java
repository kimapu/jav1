package solution.lab6.q3;

public class Circle implements GeometricObject {

	protected double radius = 1.0;
	
	public Circle( double radius ) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "; area=" + getArea() + "; perimeter=" + getPerimeter() + "]";
	}
	
}
