package singtel;

class Shark extends Fish {
	String size = "Large";
	String colour= "Grey";
	
	void walk(){
		System.out.println("I cannot walk");
	}
	
	String sing() {
		String singing = "I cannot sing";
		System.out.println("I cannot sing");
		return singing;
	}
	
	String swim() {
		String swimming = "I am swimming";
		System.out.println("I am swimming");
		return swimming;
	}

	String eatOtherFish() {
		String eat = "I eat other fish";
		System.out.println("I eat other fish");
		return eat;
	}
}