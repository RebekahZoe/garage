package Garage;

public class App {
	public static void main(String[] args) {

		Vehicle car = new Car(4, 5, 5, 500.50, 1.2, true, true, 10);
		Vehicle plane = new Plane(5, 300, 6, 1000000, 27, 20, true, "Floating");
		Vehicle boat = new Boat(0, 6, 1, 2000, 1.6, 2, 10, 2);
		Garage garage = new Garage();

		garage.addVehicle(car);
		garage.addVehicle(plane);
		garage.addVehicle(boat);

		System.out.println("The total bill is £"+ garage.calcTotalBill());
	}
}
