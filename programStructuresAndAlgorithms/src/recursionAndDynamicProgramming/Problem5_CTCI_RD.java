package recursionAndDynamicProgramming;

/**
 * Recursive Multiply: Write a recursive function to multiply two positive
 * integers without using the * operator (or/operator). You can use addition,
 * subtraction, and bit shifting, but you should minimize the number of those
 * operations.
 * 
 * @author Devashri
 *
 */
public class Problem5_CTCI_RD {

	public static int product(int a, int b) {
		
		//to handle negative numbers 
		int multiplier = 1;
		if(a<0){
			a = a * -1;
			multiplier = multiplier*-1;
		}
		
		if(b<0){
			b = b * -1;
			multiplier = multiplier*-1;
		}
		int smaller = a < b ? a : b;
		int bigger = a < b ? b : a;
		return multiplier*productHelper(smaller, bigger);
		
		
	}

	public static int productHelper(int smaller, int bigger) {
		
		if (smaller == 0) {
			return 0;
		} else if (smaller == 1) {
			return bigger;
		}
		//divide by two
		int n = smaller>>1;
		int minProd = productHelper(n, bigger);
		if(smaller%2==0){
			return minProd+minProd;
		}else{
			return minProd+minProd+bigger;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Problem5_CTCI_RD.product(-5, 20));
		System.out.println(Problem5_CTCI_RD.product(2, 20));
		
	}

}
