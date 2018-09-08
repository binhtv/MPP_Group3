package lab3.prob4;

public class Admin {
	public static double computeTotalRent(Accomodation[] properties) {
		double totalRent = 0;
		for (Accomodation a : properties) {
			totalRent += a.computeRent();
		}

		return totalRent;
	}
}
