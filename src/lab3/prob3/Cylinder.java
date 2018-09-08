package lab3.prob3;

public class Cylinder {
	private double height;
	private Circle circle;
	
	public Cylinder(double height, Circle circle) {
		this.height = height;
		this.circle = circle;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public double computeVolume() {
		return height * circle.computeArea();
	}
}
