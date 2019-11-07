package singtel;

class Clownfish extends Fish {
	String size = "Small";
	String colour= "Orange";
	
	String walk(){
		String action = "I cannot walk";
		return action;
	}
	
	String sing() {
		String action = "I cannot sing";
		return action;
	}
	
	String swim() {
		String action = "I am swimming";
		return action;
	}

	String joke() {
		String action = "I can joke";
		return action;
	}
}