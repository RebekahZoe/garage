package Garage;

public class Boat extends Vehicle {

	private int noOfSails;
	private double holdDepth;
	private int maxWindForce;

	public Boat(int noOfWheels, int capacity, int noOfDoors, double price, double engineSize, int noOfSails, double holdDepth, int maxWindForce) {
		this.setCapacity(capacity);
		this.setNoOfWheels(noOfWheels);
		this.setEngineSize(engineSize);
		this.setNoOfDoors(noOfDoors);
		this.setPrice(price);
		this.setHoldDepth(holdDepth);
		this.setMaxWindForce(maxWindForce);
		this.setNoOfSails(noOfSails);
		

	}

	public int getNoOfSails() {
		return noOfSails;
	}

	public void setNoOfSails(int noOfSails) {
		this.noOfSails = noOfSails;
	}

	public double getHoldDepth() {
		return holdDepth;
	}

	public void setHoldDepth(double holdDepth) {
		this.holdDepth = holdDepth;
	}

	public int getMaxWindForce() {
		return maxWindForce;
	}

	public void setMaxWindForce(int maxWindForce) {
		this.maxWindForce = maxWindForce;
	}

	@Override
	public String toString() {
		return "Boat";
	}

	@Override
	public double calcBill() {
		double bill = 0;
		bill = this.getPrice() / this.getHoldDepth();
		return bill;
	}

}
