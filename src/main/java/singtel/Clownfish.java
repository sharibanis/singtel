package singtel;

class Clownfish extends Fish {
	String size = "Small";
	String colour= "Orange";
	
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

	String joke() {
		String joke = "I can joke";
		System.out.println("I can joke");
		return joke;
	}
}