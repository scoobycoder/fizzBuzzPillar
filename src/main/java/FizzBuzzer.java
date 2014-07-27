
public class FizzBuzzer {

	public Object speak(Integer number) {
		if (number == 3)
			return "Fizz";
		if (number == 5)
			return "Buzz";
		return String.valueOf(number);
	}


}
