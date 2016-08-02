package test;

import moderateQuestions.Problem1_CTCI_Mod;
import moderateQuestions.Problem2_CTCI_Mod;

public class RunnerModerate {
	
	public static void main(String[] args) {
		
		System.out.println("==============Problem 1 ======================");
		Problem1_CTCI_Mod.swapNosInt(4, 5);
		Problem1_CTCI_Mod.swapNosAny(7, 8);
		System.out.println("==============Problem 2 ======================");
		System.out.println(Problem2_CTCI_Mod.getCountOfWord(new String[] {"the","a","the","a","at","if"}, "the"));
	}
	
}
