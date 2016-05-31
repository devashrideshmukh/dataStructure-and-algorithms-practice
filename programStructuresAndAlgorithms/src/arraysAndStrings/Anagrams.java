package arraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

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

		if (firstString.length() != secondString.length()) {
			return false;
		}

		HashMap<Character, Integer> characterFrequencyMap = new HashMap<Character, Integer>();

		for (int i = 0; i < firstString.length(); i++) {

			int characterCount = characterFrequencyMap.containsKey(firstString.charAt(i))
					? characterFrequencyMap.get(firstString.charAt(i)) : 0;

			characterFrequencyMap.put(firstString.charAt(i), characterCount + 1);

			int countOfSecondString = characterFrequencyMap.containsKey(secondString.charAt(i))
					? characterFrequencyMap.get(secondString.charAt(i)) : 0;
					
			characterFrequencyMap.put(secondString.charAt(i), countOfSecondString-1);
			
		}
			
		Iterator<Integer> it = characterFrequencyMap.values().iterator();
			
			while(it.hasNext()){
				Integer value = it.next();
				if(value.intValue()!=0){
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
		return Arrays.equals(char1,char2);
	}
}
