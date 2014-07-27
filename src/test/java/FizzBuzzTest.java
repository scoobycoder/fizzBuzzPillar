import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	private FizzBuzzer fizz;
	private List<String> numbers;

	@Before
	public void setup() {
		fizz = new FizzBuzzer();
		numbers = new ArrayList<String>();
		
		numbers.add("1");
		numbers.add("2");
		numbers.add("Fizz");
		numbers.add("4");
		numbers.add("Buzz");
		numbers.add("Fizz");
		numbers.add("7");
		numbers.add("8");
		numbers.add("Fizz");
		numbers.add("Buzz");
		numbers.add("11");
		numbers.add("Fizz");
		numbers.add("13");
		numbers.add("14");
		numbers.add("FizzBuzz");
	}

	@Test
	public void shouldCheckAllNumbersTo15() {

		for (int number = 1; number <= numbers.size(); number++) {
			String result = fizz.speak(number);
			System.out.println(result);
			assertEquals(numbers.get(number - 1), result);
		}

	}

}
