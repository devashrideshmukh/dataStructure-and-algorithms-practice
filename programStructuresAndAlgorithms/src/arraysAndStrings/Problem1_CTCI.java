package arraysAndStrings;

public class Problem1_CTCI {

	/**
	 * to check if the characters in an ascii string are unique
	 * space complexity O(1)
	 * time complexity O(n)
	 * @param input
	 * @return
	 */
	public static boolean isCharacterUnique(String input){
		
		//take an array which stores true or false at the index of ascii value of character
		boolean[] characterArray = new boolean[256];
		
		for(int i = 0 ; i < input.length();i++){
			//charAt taken in int stores gets acsii value
			//carAt('a') will store 97 in int
			int asciiIndex = input.charAt(i);
			if(characterArray[asciiIndex]){
				System.out.println(input.charAt(i)+" already exists");
				return false;
			}else{
				characterArray[asciiIndex] = true;
			}
			
		}
		return true;
	}
	
	
}
