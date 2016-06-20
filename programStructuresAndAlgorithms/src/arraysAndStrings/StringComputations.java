package arraysAndStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StringComputations {

	public int returnConvertedInteger(String inputString) {
		int convertedInteger = 0;
		int factor = 1;
		boolean isNegative = false;
		inputString = inputString.trim();
		if (inputString.matches("[0-9-]+")) {
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
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
		if(s==null || s.isEmpty()){
			return 0;
		}
		int max =0;
		int start = 0;
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			Character c = s.charAt(i);
			if(set.contains(c)){
				max=Math.max(max,set.size());
				while(set.contains(c)){
					set.remove(s.charAt(start));
					start++;
				}
				set.add(c);
			}else{
				set.add(c);
			}
		}
		
		max=Math.max(max,set.size());
		return max;
	}
	
	/**
	 * Reverse a string using iteration
	 * @param inputString
	 * @return
	 */
	public static String reverseStringUsingIterations(String inputString){
		StringBuffer sb = new StringBuffer();
		inputString=inputString.trim();
		for(int i=inputString.length()-1;i>=0;i--){
			sb.append(inputString.charAt(i));
		}
		return sb.toString(); 
	}
	
	public static boolean checkIfStringContainsOnlyDigits(String inputString){
		inputString = inputString.trim();
		int initialLength = inputString.length();
		String modified =inputString.replaceAll("[^0-9]", "");
		System.err.println(modified);
		if(modified.length()==initialLength){
			return true;
		}else{
			return false;
		}
	}
	

}
