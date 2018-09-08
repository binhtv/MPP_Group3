package prob2;

public final class Rectangle implements Figure {
	private double width;
	private double height;

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double computeArea() {
		return width * height;
	}

}
