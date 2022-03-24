package solution.lab5.q3;

public class ComparableCylinder extends Cylinder implements Comparable{

	public ComparableCylinder(double radius, double height) {
		super(radius, height);
		// TODO Auto-generated constructor stub
	}

	public double computeVolume()
	{
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	@Override
	public int compareTo(Object o) {
		if ( ComparableCylinder.class.isInstance(o) ) {
			ComparableCylinder next = (ComparableCylinder)o;
			if( this.computeVolume() > next.computeVolume() ) 
			{
				return 1;
			}
			else 
			{
				return -1;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "ComparableCylinder [toString()=" + super.toString() + "]";
	}
	
}
