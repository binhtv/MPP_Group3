package lab7.prob2;

public class Ellipse implements ClosedCurve {
	private double semiMajorAxis;
	private double E;

	public Ellipse(double a, double E) {
		this.semiMajorAxis = a;
		this.E = E;
	}

	@Override
	public double computePerimeter() {
		return 4 * semiMajorAxis * E;
	}

}
