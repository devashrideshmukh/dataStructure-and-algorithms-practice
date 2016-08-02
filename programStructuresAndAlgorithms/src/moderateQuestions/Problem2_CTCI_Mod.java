package moderateQuestions;

import java.util.HashMap;

/**
 * Design a method to find the frequency of occurrences of any given word in a
 * book. What if we are running the algorithm many times
 * 
 * @author Devashri
 *
 */
public class Problem2_CTCI_Mod {

	public static int getCountOfWord(String[] book, String word) {

		HashMap<String, Integer> map = setUpDictionary(book);
		for(String s:map.keySet()){
			if(s.equals(word)){
				return map.get(s);
			}
		}
		return 0;
	}

	private static HashMap<String, Integer> setUpDictionary(String[] book) {
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0;i<book.length;i++){
			String word = book[i].trim().toLowerCase();
			int count = map.containsKey(word)?map.get(word):0;
			map.put(word, count+1);
		}
		return map;
		
	}

}
