package test;

import arraysAndStrings.Problem1_CTCI;
import arraysAndStrings.Problem2_CTCI;
import arraysAndStrings.Problem3_CTCI;
import arraysAndStrings.Problem4_CTCI;
import arraysAndStrings.Problem5_CTCI;
import arraysAndStrings.Problem6_CTCI;

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
		
		Problem5_CTCI problem5 = new Problem5_CTCI();
		System.out.println("Problem 5: "+problem5.checkIfStringIfOneEditAway("pale", "ple"));
		System.out.println("Problem 5: "+problem5.checkIfStringIfOneEditAway("pales", "pale"));
		System.out.println("Problem 5: "+problem5.checkIfStringIfOneEditAway("pale", "bale"));
		System.out.println("Problem 5: "+problem5.checkIfStringIfOneEditAway("pale", "bae"));
		
		Problem6_CTCI problem6 = new Problem6_CTCI();
		System.out.println("Problem 6: "+problem6.returnCompressedString("firefoxthunderbirddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"));
		//===================================================================================//
	}
	
}
