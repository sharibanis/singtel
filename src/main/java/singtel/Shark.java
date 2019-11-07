package singtel;

class Shark extends Fish {
	String size = "Large";
	String colour= "Grey";
	
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

	String eatOtherFish() {
		String action = "I eat other fish";
		return action;
	}
}