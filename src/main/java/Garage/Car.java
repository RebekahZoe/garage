package Garage;

public class Car extends Vehicle {

	private boolean isManual;
	private boolean hasWindscreenWiper;
	private double bootSize;

	public Car(int noOfWheels, int capacity, int noOfDoors, double price, double engineSize, boolean isManual,boolean hasWindscreenWiper,
			double bootSize) {
		this.setCapacity(capacity);
		this.setNoOfWheels(noOfWheels);
		this.setEngineSize(engineSize);
		this.setNoOfDoors(noOfDoors);
		this.setPrice(price);
		this.setManual(isManual);
		this.setHasWindscreenWiper(hasWindscreenWiper);
		this.setBootSize(bootSize);
		

	}

	@Override
	public String toString() {
		return "Car ";
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public boolean isHasWindscreenWiper() {
		return hasWindscreenWiper;
	}

	public void setHasWindscreenWiper(boolean hasWindscreenWiper) {
		this.hasWindscreenWiper = hasWindscreenWiper;
	}

	public double getBootSize() {
		return bootSize;
	}

	public void setBootSize(double bootSize) {
		this.bootSize = bootSize;
	}

	@Override
	public double calcBill() {
		double bill = 0;
		bill = getPrice() / getBootSize();
		return bill;
	}

}
