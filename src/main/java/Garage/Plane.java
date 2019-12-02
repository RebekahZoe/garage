package Garage;

public class Plane extends Vehicle {

	private double wingspan;
	private boolean hasParachute;
	private String landingGearType;

	public Plane(int noOfWheels, int capacity, int noOfDoors, double price, double engineSize, double wingspan, boolean hasParachute, String
			landingGearType) {
		this.setCapacity(capacity);
		this.setNoOfWheels(noOfWheels);
		this.setEngineSize(engineSize);
		this.setNoOfDoors(noOfDoors);
		this.setPrice(price);
		this.setHasParachute(hasParachute);
		this.setLandingGearType(landingGearType);
		this.setWingspan(wingspan);
		

	}

	public double getWingspan() {
		return wingspan;
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}

	public boolean isHasParachute() {
		return hasParachute;
	}

	public void setHasParachute(boolean hasParachute) {
		this.hasParachute = hasParachute;
	}

	public String getLandingGearType() {
		return landingGearType;
	}

	public void setLandingGearType(String landingGearType) {
		this.landingGearType = landingGearType;
	}

	@Override
	public String toString() {
		return "Plane";
	}

	@Override
	public double calcBill() {
		double bill = 0;
		bill = getPrice() / getWingspan();
		return bill;
	}

}
