package singtel;

public class ParrotLivingWithRooster extends Parrot {
	@Override
	String says() {
		String saying = "Cock-a-doodle-doo";
		System.out.println("Cock-a-doodle-doo");
		return saying;
	}
}
