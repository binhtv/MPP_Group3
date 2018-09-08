package prob3.extpackage;

import prob3.Vehicle;
import prob3.VehicleFactory;

public class Main {
	public static void main(String[] args) {
		Vehicle[] vehicles = { VehicleFactory.getVehicle("bus"), VehicleFactory.getVehicle("car"),
				VehicleFactory.getVehicle("electric car"), VehicleFactory.getVehicle("truck") };
		for(Vehicle v : vehicles) {
			v.startEngine();
		}
	}
}
