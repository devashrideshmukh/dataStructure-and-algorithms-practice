package arraysAndStrings;

public class PalindromeString {
	// remember replaceAll regex
	public boolean isTextPalindrome(String inputString) {
		String modifiedString = inputString.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		if (modifiedString == null) {
			return false;
		} else {
			int first = 0;
			int last = modifiedString.length() - 1;
			while(first<last) {
				if (modifiedString.charAt(last) != modifiedString.charAt(first)) {
					return false;
				} else {
					last--;
					first++;
				}
			}
			
			return true;
		}
	}

}
