package bitWiseOperations;

public class PowerOfTwo {

	/**
	 * Write a method - isPowOfTwo to test whether or not a given positive
	 * integer is a power of 2. Your method should run in constant O(1) time and
	 * use O(1) space.
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isPowOfTwo(int num) {
		int result = num & (num - 1);
		if (num == 0) {
			return false;
		}
		if (result == 0 || num == 1) {
			return true;
		} else {
			return false;
		}
	}

}
