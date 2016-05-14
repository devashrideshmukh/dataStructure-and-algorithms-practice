package arraysAndStrings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Problem4_CTCI {

	/**
	 * Checks if the given input string is a permutation of palindromes
	 * Take hashmap for keeping frequency of characters
	 * All the frequencies should be even
	 * Only one add frequency is allowed
	 */
	public boolean checkIfPermuationOfPalindrome(String input){
		
		//eliminate space in between
		input = input.trim().toLowerCase().replace(" ","");
		HashMap<Character,Integer> characterCountMap = new HashMap<>();
		
		for(int i = 0 ; i<input.length();i++){
			Integer value = characterCountMap.get(input.charAt(i));
			if(value==null){
				characterCountMap.put(input.charAt(i), 1);
				
			}else{
				characterCountMap.put(input.charAt(i), value+1);
			}
			
		}
		
		Iterator it = characterCountMap.entrySet().iterator();
		int countOfOdds = 0;
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        Integer value = (Integer) pair.getValue();
	        if(value%2!=0){
	        	countOfOdds++;
	        }
	        it.remove(); // avoids a ConcurrentModificationException
	    }
		
		if(countOfOdds == 1 || countOfOdds == 0){
			return true;
		}else{
			return false;
		}
	    
	}
	
}
