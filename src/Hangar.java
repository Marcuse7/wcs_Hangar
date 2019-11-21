package src;

public class Hangar {

	public static void main(String[] args) {

		Car clio = new Car("Clio", 1000);
		System.out.println( clio.doStuff() );
		
		Boat titanic = new Boat("Titanic", 2800);
		System.out.println( titanic.doStuff() );

	}

}
