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
}
