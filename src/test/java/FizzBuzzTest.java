import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void shouldReturn1For1() {
		FizzBuzzer fizz = new FizzBuzzer();
		assertEquals("1", fizz.speak("1"));
	}
	
}
