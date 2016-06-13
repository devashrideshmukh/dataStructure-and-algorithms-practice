package arraysAndStrings;

/**
 * Check is a given string is a rotation of another using method isSubstring
 * only once
 * 
 * @author Devashri
 *
 */
public class Program9_CTCI {

	public boolean isStringRotation(String s1, String s2) {
		
		s1 = s1.trim().replace(" ", "");
		s2 = s2.trim().replace(" ", "");
		
		if (s1.length() != s2.length()) {
			return false;
		}
		
		String s1s1 = s1+s1;
		return isSubstring(s1s1, s2);
	}

	public boolean isSubstring(String s1, String s2) {
		return s1.toLowerCase().contains(s2.toLowerCase());
	}

}
