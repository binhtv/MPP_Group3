package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Owner {
	private List<Building> buildings;
	
	public Owner() {
		buildings = new ArrayList<>();
	}
	
	public List<Building> getBuildings() {
		return buildings;
	}

	public void addBuilding(Building building) {
		this.buildings.add(building);
	}
	
	public double calculateProfits() {
		double total = 0;
		for(Building b : buildings) {
			double totalApartment = 0;
			for(Apartment a : b.getApartments()) {
				totalApartment += a.getRent();
			}
			total += (totalApartment - b.getMaintenanceCost());
		}
		
		return total;
	}
}
