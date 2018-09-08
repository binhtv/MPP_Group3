package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private List<Apartment> apartments;
	private double maintenanceCost;

	public Building() {
		maintenanceCost = 0;
		apartments = new ArrayList<>();
	}
	
	public List<Apartment> getApartments() {
		return apartments;
	}

	public void addApartment(Apartment apartment) {
		this.apartments.add(apartment);
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}
}
