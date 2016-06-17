package arraysAndStrings;

public class PalindromeString {
	// remember replaceAll regex
	public boolean isTextPalindrome(String inputString) {
		
		inputString = inputString.trim().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		if(inputString.length()==0 || inputString==null){
			return false;
		}else{
			int first =0;
			int last = inputString.length()-1;
			while(first<last){
				if(inputString.charAt(first)!=inputString.charAt(last)){
					return false;
				}else{
					first++;
					last--;
				}
			}
			return true;
		}
	}

}
