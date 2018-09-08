package lab3.prob4.extpackage;

import lab3.prob4.Accomodation;
import lab3.prob4.Admin;
import lab3.prob4.Condo;
import lab3.prob4.House;
import lab3.prob4.Trailer;

public class Driver {

	public static void main(String[] args) {
		Accomodation[] objects = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}
