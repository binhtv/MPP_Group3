package lab3.prob4;

public class Condo extends Accomodation {
	private int numFloors;
	
	public Condo(int numberFloor) {
		numFloors = numberFloor;
	}
	
	@Override
	protected double computeRent() {
		return 400 * numFloors;
	}
}
