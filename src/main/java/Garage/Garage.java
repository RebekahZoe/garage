package Garage;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

	public double calcTotalBill() {
		double bill = 0;
		for (Vehicle v : this.garage)
			bill += v.calcBill();
		return bill;
	}

	public double getBill(Vehicle vehicle) {
		double bill = 0;
		if (vehicle instanceof Car) {
			bill = vehicle.getPrice() / (((Car) vehicle).getBootSize());
		} else if (vehicle instanceof Plane) {
			bill = vehicle.getPrice() / (((Plane) vehicle).getWingspan());
		} else if (vehicle instanceof Boat) {
			bill = vehicle.getPrice() / (((Boat) vehicle).getHoldDepth());
		}
		return bill;
	}

	public void addVehicle(Vehicle vehicle) {

		garage.add(vehicle);

	}

	public void removeVehicle(Vehicle vehicle) {

		garage.remove(vehicle);

	}
}
