package arraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Check if two strings are anagrams of each other
 * 
 * @author Devashri
 *
 */
public class Anagrams {

	public boolean isAnagram(String firstString, String secondString) {

		firstString = firstString.trim().replace(" ", "").toLowerCase();
		secondString = secondString.trim().replace(" ", "").toLowerCase();

		HashMap<Character, Integer> mapOfFrequency = new HashMap<>();

		if (firstString.length() != secondString.length()) {
			return false;
		}

		for (int i = 0; i < firstString.length(); i++) {
			Character firstChar = firstString.charAt(i);
			Integer count = mapOfFrequency.containsKey(firstChar) ? mapOfFrequency.get(firstChar) : 0;
			mapOfFrequency.put(firstChar, count+1);
			Character secondChar = secondString.charAt(i);
			Integer count2 = mapOfFrequency.containsKey(secondChar) ? mapOfFrequency.get(secondChar) : 0;
			mapOfFrequency.put(secondChar, count2-1);
		}
		
		Iterator<Entry<Character, Integer>> it = mapOfFrequency.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Character, Integer> pair = (Map.Entry<Character, Integer>)it.next();
			if(pair.getValue()!=0){
				return false;
			}
		}
		return true;
	}

	public boolean isAnagramUsingArrays(String firstString, String secondString) {
		firstString = firstString.trim().replace(" ", "").toLowerCase();
		secondString = secondString.trim().replace(" ", "").toLowerCase();
		char[] char1 = firstString.toCharArray();
		char[] char2 = secondString.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		return Arrays.equals(char1, char2);
	}
}
