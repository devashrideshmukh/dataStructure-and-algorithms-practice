package arraysAndStrings;

public class OccurancesOfCharacter {

	public int countOccurances(String inputString, char character) {
		String modifiedString = inputString.replaceAll("[^" + character + "]", "");
		return modifiedString.length();
	}

}
