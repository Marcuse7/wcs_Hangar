package src;

public abstract class Vehicle {

	String brand;
	int kilometers;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	public Vehicle( String brand, int kilometers ) {
		this.brand = brand;
		this.kilometers = kilometers;
	}
	
	public abstract String doStuff();
	
}
