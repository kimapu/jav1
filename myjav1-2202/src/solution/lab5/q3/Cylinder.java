package solution.lab5.q3;

public class Cylinder extends GeometricObject {

	protected double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public double computeArea() 
	{
		return (2 * Math.PI * super.radius * this.height) + 
				(2 * Math.PI * Math.pow(super.radius, 2));
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", toString()=" + super.toString() + "]";
	}
	
}
