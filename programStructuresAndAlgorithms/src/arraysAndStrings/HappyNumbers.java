package arraysAndStrings;

import java.util.HashSet;
import java.util.Set;

/**
 * A number is Happy (Yes, it is a thing!) if it follows a sequence that ends in
 * 1 after following the steps given below : Beginning with the number itself,
 * replace it by the sum of the squares of its digits until either the number
 * becomes 1 or loops endlessly in a cycle that does not include 1.
 * 
 * For instance, 19 is a happy number. Sequence: 12 + 92 = 82 82 + 22 = 68 62 +
 * 82 = 100 12 + 02 + 02 = 1
 * 
 * @author Devashri
 *
 */
public class HappyNumbers {

	public static boolean isHappyNumber(int n) {

		Set<Integer> set = new HashSet<Integer>();
		int newNum = n;

		while (!set.contains(newNum)) {
			int sum = 0;
			set.add(newNum);
			while (newNum > 0) {
				int dig = newNum % 10;
				sum = sum + (dig * dig);
				newNum = newNum / 10;
			}
			newNum = sum;
			if (newNum == 1) {
				return true;
			}
		}

		return false;
	}

}
