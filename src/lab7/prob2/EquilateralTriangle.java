package lab7.prob2;

public class EquilateralTriangle implements Polygon {
	private double a;

	public EquilateralTriangle(double a) {
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double[] getSides() {
		return new double[] { a, a, a };
	}
}
