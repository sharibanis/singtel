package singtel;

import static org.junit.Assert.assertEquals;
import org.junit.Assert.*;				
import org.junit.Test;		

public class FishTest {
	Fish fish = new Fish();
	
	@Test
	public void sing() {
		String expected = "I cannot sing";
		assertEquals(expected, fish.sing());
	}

	@Test
	public void swim() {
		String expected = "I am swimming";
		assertEquals(expected, fish.swim());
	}

	Shark shark = new Shark();
	@Test
	public void eatOtherFish() {
		String expected = "I eat other fish";
		assertEquals(expected, shark.eatOtherFish());
	}

	Clownfish clownfish = new Clownfish();
	@Test
	public void joke() {
		String expected = "I can joke";
		assertEquals(expected, clownfish.joke());
	}

}
