package singtel;

public class Rooster extends Chicken {

	@Override
	String says() {
		String action = "Cock-a-doodle-doo";
		return action;
	}
	
	@Override
	String fly() {
		String action = "I cannot fly";
		return action;
	}
}
