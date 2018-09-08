package prob2;

public final class Circle implements Figure {
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return Math.PI * radius * radius;
	}

}
