package singtel;

public class Chicken extends Bird {

	String says() {
		String saying = "Cluck, cluck";
		System.out.println("Cluck, cluck");
		return saying;
	}
	
	@Override
	void fly() {
		System.out.println("I cannot fly");
	}
}
