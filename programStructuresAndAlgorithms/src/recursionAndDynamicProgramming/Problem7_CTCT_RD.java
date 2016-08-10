package recursionAndDynamicProgramming;

import java.util.ArrayList;

/**
 * Permutations without Dups: Write a method to compute all permutations of a
 * string of unique characters .
 * 
 * O(n * n!) n is for printing
 * else
 * O(n)
 * @author Devashri
 *
 */
public class Problem7_CTCT_RD {
	public static void main(String[] args) {
		ArrayList<String> list = Problem7_CTCT_RD.findPermutations("dev");
		System.out.println(list.toString()+"\n"+list.size());
	}
	
	public static ArrayList<String> findPermutations(String inputString){
		ArrayList<String> result = new ArrayList<String>();
		inputString = inputString.trim().replace(" ", "");
		getPerms("",inputString,result);
		return result;
	}
	
	private  static void getPerms(String prefix,String remainder,ArrayList<String> result){
		
		if(remainder.length()==0){
			System.out.println(prefix);
			result.add(prefix);
		}
		
		for(int i=0;i<remainder.length();i++){
			String before = remainder.substring(0,i);
			String after = remainder.substring(i+1,remainder.length());
			char c = remainder.charAt(i);
			getPerms(prefix+c, before+after, result);
		}
	}
}
