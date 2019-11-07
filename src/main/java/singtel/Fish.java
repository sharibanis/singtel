package singtel;

class Fish extends Animal {
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
}