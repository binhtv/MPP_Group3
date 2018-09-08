package prob2;

public final class Triangle implements Figure {
	private double height;
	private double base;
	
	public double getHeight() {
		return height;
	}

	public double getBase() {
		return base;
	}

	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}
	
	public double computeArea() {
		return base * height / 2.0;
	}

}
