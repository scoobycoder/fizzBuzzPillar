import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void shouldPrintNumbersOneToFifteen() {
		FizzBuzzer fizzBuzzer = new FizzBuzzer();
		assertEquals("123456789101112131415", fizzBuzzer.speak());
		
	}
	
}
