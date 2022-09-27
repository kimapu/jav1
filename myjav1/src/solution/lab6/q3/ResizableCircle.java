package solution.lab6.q3;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public void resize(int percent) {
		System.out.println( super.toString() );
		System.out.println( "> ResizeableCircle is being resized..." );
	}

}
