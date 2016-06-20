package problemsOnRecursion;

public class ReverseAStringUsingRecursion {
		
		public static String reverseAStringUsingRecursion(String inputString){
			if(inputString.length()==1){
				return inputString;
			}
			return reverseAStringUsingRecursion(inputString.substring(1,inputString.length()))+inputString.charAt(0);
		}
}
