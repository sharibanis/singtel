package singtel;

import static org.junit.Assert.assertEquals;
import org.junit.Assert.*;				
import org.junit.Test;		

public class BirdTest {
	Bird bird = new Bird();
	
	@Test
	public void sing() {
		String expected = "I am singing";
		assertEquals(expected, bird.sing());
	}

	Duck duck = new Duck();

	@Test
	public void says() {
		String expected = "Quack, quack";
		assertEquals(expected, duck.says());
	}

	@Test
	public void swim() {
		String expected = "I am swimming";
		assertEquals(expected, duck.swim());
	}

	Chicken chicken = new Chicken();

	@Test
	public void chickenSays() {
		String expected = "Cluck, cluck";
		assertEquals(expected, chicken.says());
	}

	@Test
	public void chickenFly() {
		chicken.fly();
	}

	Rooster rooster = new Rooster();

	@Test
	public void roosterSays() {
		String expected = "Cluck, cluck";
		assertEquals(expected, rooster.says());
	}

	

}
