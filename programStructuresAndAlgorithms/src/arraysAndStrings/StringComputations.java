package arraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class StringComputations {

	public int returnConvertedInteger(String inputString) {
		int convertedInteger = 0;
		int factor = 1;
		boolean isNegative = false;
		inputString = inputString.trim();
		if (inputString.matches("[0-9-]+")) {

			if ((inputString.charAt(0) == '-' || inputString.charAt(0) == '+') && inputString.length() == 1) {
				return 0;
			}

			if (inputString.charAt(0) == '-') {
				isNegative = true;
				inputString = inputString.substring(1);
			}
			for (int i = inputString.length() - 1; i >= 0; i--) {
				convertedInteger += (inputString.charAt(i) - '0') * factor;
				factor = factor * 10;
			}

			if (isNegative) {
				convertedInteger = convertedInteger * -1;
			}
		} else {
			System.err.println("The input string cannot contain alphabets");
		}

		return convertedInteger;
	}

	/**
	 * Return first non-repeating character
	 * 
	 * @param inputString
	 * @return
	 */
	public char getFirstNonRepeatingCharacter(String inputString) {

		// use linked hashmap as it preserves insertion order
		LinkedHashMap<Character, Integer> characterFrequencyMap = new LinkedHashMap<>();
		inputString = inputString.trim().replace(" ", "");

		for (int i = 0; i < inputString.length(); i++) {
			int count = characterFrequencyMap.containsKey(inputString.charAt(i))
					? characterFrequencyMap.get(inputString.charAt(i)) : 0;

			characterFrequencyMap.put(inputString.charAt(i), count + 1);
		}

		Iterator it = characterFrequencyMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Character, Integer> pair = (Map.Entry<Character, Integer>) it.next();
			if (pair.getValue() == 1) {
				return pair.getKey();
			}
		}

		return '0';

	}

	/**
	 * Find the length of longest substring without repeating characters
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}
		int max = 0;
		int start = 0;
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (set.contains(c)) {
				max = Math.max(max, set.size());
				while (set.contains(c)) {
					set.remove(s.charAt(start));
					start++;
				}
				set.add(c);
			} else {
				set.add(c);
			}
		}

		max = Math.max(max, set.size());
		return max;
	}

	/**
	 * Reverse a string using iteration
	 * 
	 * @param inputString
	 * @return
	 */
	public static String reverseStringUsingIterations(String inputString) {
		StringBuffer sb = new StringBuffer();
		inputString = inputString.trim();
		for (int i = inputString.length() - 1; i >= 0; i--) {
			sb.append(inputString.charAt(i));
		}
		return sb.toString();
	}

	public static boolean checkIfStringContainsOnlyDigits(String inputString) {
		inputString = inputString.trim();
		int initialLength = inputString.length();
		String modified = inputString.replaceAll("[^0-9]", "");
		System.err.println(modified);
		if (modified.length() == initialLength) {
			return true;
		} else {
			return false;
		}
	}

	public static int numberOfVowels(String inputString) {
		inputString = inputString.trim();
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			char charAtI = inputString.charAt(i);
			switch (charAtI) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:

			}
		}
		return count;
	}

	/**
	 * Given a List of Strings, write a method removeDuplicates that removes
	 * duplicate words from the List and returns an ArrayList of all the unique
	 * words. The returned ArrayList should be lexically alphabetically.
	 * 
	 * @param input
	 * @return
	 */
	public static ArrayList<String> removeDuplicates(List<String> input) {

		Set<String> set = new TreeSet<>();

		set.addAll(input);
		input.clear();
		input.addAll(set);

		return (ArrayList<String>) input;
	}

	/**
	 * Given two strings - input1 and input2, determine if they are isomorphic.
	 * Two strings are isomorphic if the letters in one string can be remapped
	 * to get the second string. Remapping a letter means replacing all
	 * occurrences of it with another letter. The ordering of the letters
	 * remains unchanged. You can also think of isomorphism as it is used in
	 * chemistry - i.e. having the same form or overall shape. Target linear
	 * time and space complexity with your solution.
	 * 
	 * @param input1
	 * @param input2
	 * @return
	 */
	public static boolean isIsomorphic(String input1, String input2) {

		if (input1 == null || input2 == null) {
			return false;
		}

		if (input1.length() != input2.length()) {
			return false;
		}

		if (input1.length() == 0) {
			return true;
		}

		HashMap<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < input1.length(); i++) {

			char c1 = input1.charAt(i);
			char c2 = input2.charAt(i);

			if (map.containsKey(c1)) {
				if (map.get(c1) != c2) {
					return false;
				}
			} else {

				if (map.containsValue(c2)) {
					return false;
				}
				map.put(c1, c2);
			}
		}

		return true;
	}

	/**
	 * Given a string, recursively compute a new string where the identical
	 * adjacent characters in the original string are separated by a "*".
	 * 
	 * @param s
	 * @return
	 */
	public static String insertPairStar(String s) {

		if (s == null || s.length() == 0 || s.length() == 1) {
			return s;
		}

		if (s.charAt(0) == s.charAt(1)) {
			return s.substring(0, 1) + "*" + insertPairStar(s.substring(1, s.length()));
		} else {
			return s.substring(0, 1) + insertPairStar(s.substring(1, s.length()));
		}

	}

	
	/**
	 * Write a method to compute the binary representation of a positive
	 * integer. The method should return a string with 1s and 0s.
	 * 
	 * @param val
	 * @return
	 */
	public static String computeBinary(int val) {

		StringBuffer sb = new StringBuffer();
		Stack<Integer> stack = new Stack<Integer>();

		if (val == 0) {
			return "0";
		}

		while (!(val < 1)) {
			stack.push((val % 2));
			val = val / 2;
		}

		while (!stack.empty()) {
			sb.append(stack.pop());
		}

		return sb.toString();

	}
}
