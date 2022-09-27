package solution.lab4.q2;

public class Fan {

	private Speed speed;
	private Boolean on;
	private double radius;
	private String color;
	
	public Fan() {
		// TODO Auto-generated constructor stub
	}

	public Fan(Speed speed, Boolean on, double radius, String color) {
		super();
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}

	public int getSpeed() {
		return speed.getValue();
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

	public Boolean getOn() {
		return on;
	}

	public void setOn(Boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
	}

	
}
