package solution.lab5.q3;

public class GeometricObject implements Comparable {

	protected double radius;

	public GeometricObject(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public int compareTo(Object o) {
		if ( Circle.class.isInstance(this) ) {
			Circle c1 = (Circle)this;
			Circle c2 = (Circle)o;
			if( c1.computeArea() > c1.computeArea() )
				return 1;
			else
				return -1;
		} else if( Cylinder.class.isInstance(this) ) {
			Cylinder cy1 = (Cylinder)this;
			Cylinder cy2 = (Cylinder)o;
			if( cy1.computeArea() > cy2.computeArea() )
				return 1;
			else
				return -1;
		} else
			return 0;
	}

	public int max( GeometricObject shape )
	{
		return this.compareTo(shape);
	}

	@Override
	public String toString() {
		return "GeometricObject [radius=" + radius + "]";
	}
}
