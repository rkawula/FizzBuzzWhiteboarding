
public class FizzBuzz {
	
	public static String doFizzBuzz(int theNum) {
		if (theNum % 15 == 0) {
			return "Fizzbuzz";
		} else if (theNum % 3 == 0) {
			return "Fizz";
		} else if(theNum % 5 == 0) {
			return "Buzz";
		} else {
			return "" + theNum;
		}
	}

	public static void main(String[] args) {
		StringBuilder fizzBuzzOutput = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			fizzBuzzOutput.append(doFizzBuzz(i) + "\n");
		}
		System.out.println(fizzBuzzOutput);
	}

}
