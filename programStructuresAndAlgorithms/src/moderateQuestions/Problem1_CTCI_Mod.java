package moderateQuestions;

/**
 * Write a function to swap two numbers without using a temporary variable
 * @author Devashri
 *
 */
public class Problem1_CTCI_Mod {
	
	//works only for int
	public static void swapNosInt(long a,long b){
		System.out.println("Initial value of a "+a);
		System.out.println("Initial value of b "+b);
		a = a-b;
		b = a+b;
		a = b-a;
		System.out.println("Initial value of a "+a);
		System.out.println("Initial value of b "+b);
	}
	
	//works for many data types
	public static void swapNosAny(long a,long b){
		System.out.println("Initial value of a "+a);
		System.out.println("Initial value of b "+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("Initial value of a "+a);
		System.out.println("Initial value of b "+b);
	}
	
	
	
}
