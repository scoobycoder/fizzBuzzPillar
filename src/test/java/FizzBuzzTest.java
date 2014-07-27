import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {
	private FizzBuzzer fizz;

	@Before
	public void setup() {
		fizz = new FizzBuzzer();
	}
	
	@Test
	public void shouldReturn1For1() {
		assertEquals("1", fizz.speak(1));
	}
	
	@Test
	public void shouldReturnFizzFor3() {
		assertEquals("Fizz", fizz.speak(3));
	}
	
	
	
}
