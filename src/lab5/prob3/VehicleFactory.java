package lab5.prob3;

public final class VehicleFactory {
	public static final Vehicle getVehicle(String v) {
		Vehicle vehicle = null;
		if("car".equalsIgnoreCase(v)) {
			vehicle = new Car(); 
		} else if("truck".equalsIgnoreCase(v)) {
			vehicle = new Truck();
		} else if("bus".equalsIgnoreCase(v)) {
			vehicle = new Bus();
		} else if("electric car".equalsIgnoreCase(v)) {
			vehicle = new ElectricCar();
		}
		
		return vehicle;
	}
}
