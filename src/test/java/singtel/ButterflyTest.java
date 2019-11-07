package singtel;

import static org.junit.Assert.assertEquals;
import org.junit.Assert.*;				
import org.junit.Test;		

public class ButterflyTest {
	Butterfly butterfly = new Butterfly();
	
	@Test
	public void sing() {
		String expected = "I cannot make a sound";
		assertEquals(expected, butterfly.sing());
	}

}
