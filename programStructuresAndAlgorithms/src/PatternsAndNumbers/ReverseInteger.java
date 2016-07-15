package PatternsAndNumbers;

public class ReverseInteger {

	public static int reverseInt(int x) {

		int reversedInteger = 0;
		boolean isNegative = false;
		if (x < 0) {
			isNegative = true;
		}

		if (isNegative) {
			x = x * -1;
		}

		while (x != 0) {
			reversedInteger = (reversedInteger * 10) + x%10;
			x = x / 10;
			
		}

		if (isNegative) {
			reversedInteger = reversedInteger * -1;
		}
		return reversedInteger;

	}

}