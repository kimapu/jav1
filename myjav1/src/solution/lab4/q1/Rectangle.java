package solution.lab4.q1;

public class Rectangle {

	private double width, height;
	private static String color;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Rectangle.color = color;
	}

	public Rectangle(double width, double height, String color) {
		super();
		this.width = width;
		this.height = height;
		Rectangle.color = color;
	}

	public double findArea() {
		return this.width * this.height;
	}
	
	public double findPerimeter() {
		return 2 * (this.width*this.height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", Area="+ findArea() + ", Perimeter=" + findPerimeter() + "]";
	}
	
	

}
