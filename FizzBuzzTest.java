import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void fizzBuzz() {
		assertEquals(FizzBuzz.doFizzBuzz(15), "Fizzbuzz");
	}
	
	@Test
	public void fizz() {
		assertEquals(FizzBuzz.doFizzBuzz(3), "Fizz");
	}
	
	@Test
	public void buzz() {
		assertEquals(FizzBuzz.doFizzBuzz(5), "Buzz");
	}
	
	@Test
	public void normalNumberOutput() {
		assertEquals(FizzBuzz.doFizzBuzz(16), "16");
	}

}
