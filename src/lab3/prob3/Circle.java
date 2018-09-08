package lab3.prob3;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double computeArea() {
		return Math.PI * Math.sqrt(this.radius);
	}
}
