package lab3.prob4;

public class House extends Accomodation {
	private double lotSize;

	public House(double lotSize) {
		this.lotSize = lotSize;
	}

	@Override
	protected double computeRent() {
		return 0.1 * lotSize;
	}
}
