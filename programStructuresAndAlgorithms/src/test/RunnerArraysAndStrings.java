package test;

import arraysAndStrings.Anagrams;
import arraysAndStrings.OccurancesOfCharacter;
import arraysAndStrings.PalindromeString;
import arraysAndStrings.Problem1_CTCI;
import arraysAndStrings.Problem2_CTCI;
import arraysAndStrings.Problem3_CTCI;
import arraysAndStrings.Problem4_CTCI;
import arraysAndStrings.Problem5_CTCI;
import arraysAndStrings.Problem6_CTCI;
import arraysAndStrings.Problem7_CTCI;
import arraysAndStrings.StringComputations;
import arraysAndStrings.TwoSum;

public class RunnerArraysAndStrings {

	public static void main(String[] args) {
		
		
		//===================ARRAYS AND STRINGS===============================================//
		Problem1_CTCI problem1 = new Problem1_CTCI();
		System.out.println("Problem 1: "+problem1.isCharacterUnique("Devashri"));
		System.out.println("Problem 1: "+problem1.isCharacterUnique("DevashriD"));
		System.out.println("Problem 1: "+problem1.isCharacterUnique(""));
		
		Problem2_CTCI problem2 = new Problem2_CTCI();
		System.out.println("Problem 2: "+problem2.checkPermutations1("Devashri", "irhsaveD"));
		System.out.println("Problem 2: "+problem2.checkPermutations2("Devasasd", "irhsaveD"));
		
		Problem3_CTCI problem3 = new Problem3_CTCI();
		System.out.println("Problem 3: "+problem3.urlify1("Deva shri"));
		System.out.println("Problem 3: "+problem3.urlify2("Deva shri"));
		
		Problem4_CTCI problem4 = new Problem4_CTCI();
		System.out.println("Problem 4: "+problem4.checkIfPermuationOfPalindrome("taco cat"));
		System.out.println("Problem 4: "+problem4.checkIfPermuationOfPalindrome("amyamalla"));
		System.out.println("Problem 4: "+problem4.checkIfPermuationOfPalindrome("Devashri"));
		System.out.println("Problem 4: "+problem4.checkIfPermuationOfPalindrome(" "));
		System.out.println("Problem 4: "+problem4.checkIfPermuationOfPalindrome("DevkkkaaaveD"));
		
		Problem5_CTCI problem5 = new Problem5_CTCI();
		System.out.println("Problem 5: "+problem5.checkIfStringIfOneEditAway("pale", "ple"));
		System.out.println("Problem 5: "+problem5.checkIfStringIfOneEditAway("pales", "pale"));
		System.out.println("Problem 5: "+problem5.checkIfStringIfOneEditAway("pale", "bale"));
		System.out.println("Problem 5: "+problem5.checkIfStringIfOneEditAway("pale", "bae"));
		
		Problem6_CTCI problem6 = new Problem6_CTCI();
		System.out.println("Problem 6: "+problem6.returnCompressedString("firefoxthunderbirddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"));
		
		TwoSum ts = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		int[] result=ts.twoSum(nums,9);
		int[] result1=ts.twoSum(nums,9);
		System.out.println("The indices are:"+result[0]+","+result[1]);
		System.out.println("The indices are (one pass):"+result1[0]+","+result1[1]);
		
		Anagrams anagrams = new Anagrams();
		System.out.println("Is anagram ? "+anagrams.isAnagram("devashri", "irhsaved"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("Mother In Law", "Hitler Woman"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("keEp", "peeK"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("SiLeNt CAT", "LisTen AcT"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("Debit Card", "Bad Credit"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("School MASTER", "The ClassROOM"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("DORMITORY", "Dirty Room"));
		System.out.println("Is anagram ? "+anagrams.isAnagramUsingArrays("ASTRONOMERS", "NO MORE STARS"));
		System.out.println("Is anagram ? "+anagrams.isAnagram("joy", "enjoy"));
		System.out.println("Is anagram ? "+anagrams.isAnagramUsingArrays("Toss", "Shot"));
		
		PalindromeString ps = new PalindromeString();
		System.out.println("madam is palindrome : "+ ps.isTextPalindrome("ma,dam"));
		System.out.println("mada is palindrome : "+ ps.isTextPalindrome("mada"));
		System.out.println("devashriirhsaved is palindrome : "+ ps.isTextPalindrome("devashriirhsaved"));
		System.out.println("devashri8rhsaved is palindrome : "+ ps.isTextPalindrome("devashri8rhsaved"));
		
		OccurancesOfCharacter occ = new OccurancesOfCharacter();
		System.out.println("Count of D in 'DevashriDeshmukh' "+occ.countOccurances("DevashriDeshmukh",'D'));
		
		Problem7_CTCI prob7 = new Problem7_CTCI();
		int[][] matrix = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};
		prob7.rotate(matrix, 6);
		for(int i=0;i<matrix.length;i++){
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		StringComputations stringComputations = new StringComputations();
		System.out.println("'122' converted to integer : "+stringComputations.returnConvertedInteger("   122"));
		System.out.println("'-122' converted to integer : "+stringComputations.returnConvertedInteger("-122"));
		
		//===================================================================================//
	}
	
}
