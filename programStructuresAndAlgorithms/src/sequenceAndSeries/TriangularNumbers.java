package sequenceAndSeries;

/**
 * To generate nth triangular number
 * i.e. any of the series of numbers (1, 3, 6, 10, 15, etc.) 
 * obtained by continued summation of the natural 
 * numbers 1, 2, 3, 4, 5, etc.
 * @author Devashri
 *
 */
public class TriangularNumbers {
	
	public int getTriangularNumber(int n){
		int sum = 0;
		for(int i=1;i<=n;i++){
			sum = sum + i;
		}
		return sum;
	}
	
	public int getTriangularNumberUsingRecursion(int n){
		
		System.out.println("Method:"+ n);
		if(n==1){
			System.out.println("Returning 1 : base case");
			return 1;
		}else{
			return n + getTriangularNumberUsingRecursion(n-1);
			 
		}
	}

}
