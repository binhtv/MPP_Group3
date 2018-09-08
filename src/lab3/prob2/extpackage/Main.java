package lab3.prob2.extpackage;

import lab3.prob2.Apartment;
import lab3.prob2.Building;
import lab3.prob2.Owner;

public class Main {
	public static final void main(String...strings) {
		Building buildingA = new Building();
		buildingA.setMaintenanceCost(100.5);
		Apartment a1 = new Apartment();
		a1.setRent(550);
		Apartment a2 = new Apartment();
		a2.setRent(650);
		Apartment a3 = new Apartment();
		a3.setRent(750);
		buildingA.addApartment(a1);
		buildingA.addApartment(a2);
		buildingA.addApartment(a3);
		
		Building buildingB = new Building();
		buildingB.setMaintenanceCost(450);
		Apartment a4 = new Apartment();
		a4.setRent(900);
		Apartment a5 = new Apartment();
		a5.setRent(880);
		Apartment a6 = new Apartment();
		a6.setRent(650);
		buildingA.addApartment(a4);
		buildingA.addApartment(a5);
		buildingA.addApartment(a6);
		
		Building buildingC = new Building();
		buildingB.setMaintenanceCost(950);
		Apartment a7 = new Apartment();
		a7.setRent(900);
		Apartment a8 = new Apartment();
		a8.setRent(1080);
		Apartment a9 = new Apartment();
		a6.setRent(850);
		buildingC.addApartment(a7);
		buildingC.addApartment(a8);
		buildingC.addApartment(a9);
		
		Owner bob = new Owner();
		bob.addBuilding(buildingA);
		bob.addBuilding(buildingB);
		Owner alice = new Owner();
		alice.addBuilding(buildingC);
		System.out.println("Bob's profit: " + bob.calculateProfits());
		System.out.println("Alice's profit: " + alice.calculateProfits());
	}
}
