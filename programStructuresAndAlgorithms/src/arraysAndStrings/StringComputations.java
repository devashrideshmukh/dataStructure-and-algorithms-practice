package arraysAndStrings;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

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

}
