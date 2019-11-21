package src;

public class Boat extends Vehicle {
	Boat(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String doStuff() {
		// TODO Auto-generated method stub
		return "I'm " + this.brand + " and I go glug glug!";
	}
}
