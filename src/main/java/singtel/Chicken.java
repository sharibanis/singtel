package singtel;

public class Chicken extends Bird {

	String says() {
		String saying = "Cluck, cluck";
		return saying;
	}
	
	@Override
	String fly() {
		String action = "I cannot fly";
		return action;
	}
}
