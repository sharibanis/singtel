package singtel;

public class Rooster extends Chicken {

	String says() {
		String saying = "Cock-a-doodle-doo";
		System.out.println("Cock-a-doodle-doo");
		return saying;
	}
	
	@Override
	void fly() {
		System.out.println("I cannot fly");
	}
}
