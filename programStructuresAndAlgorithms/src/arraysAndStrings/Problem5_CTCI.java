package arraysAndStrings;

public class Problem5_CTCI {

	/**
	 * function to check if two strings are one or zero edits away replace()
	 * insert() remove()
	 */

	public boolean checkIfStringIfOneEditAway(String mainString, String editedString) {

		int lengthDifference = Math.abs(mainString.length() - editedString.length());

		// if the length difference is more that one then it is definitely not
		// one edit away
		// hence delete loop
		if (lengthDifference > 1) {
			return false;
		}

		if (mainString.length() == editedString.length()) {
			return sameLengthEdit(mainString, editedString);
		} else if (mainString.length() < editedString.length()) {
			return insertedOrRemoved(mainString, editedString);
		} else {
			return insertedOrRemoved(editedString, mainString);
		}

	}

	public boolean sameLengthEdit(String mainString, String editedString) {
		boolean foundDifference = false;
		for (int i = 0; i < mainString.length(); i++) {
			if (mainString.charAt(i) != editedString.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}

	public boolean insertedOrRemoved(String first, String second) {

		int index1 = 0;
		int index2 = 0;

		while (index1 < first.length() && index2 < second.length()) {
			if (first.charAt(index1) != second.charAt(index2)) {
				if (index2 != index1) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}

		return true;
	}

}
