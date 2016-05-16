package sequenceAndSeries;

/**
 * To print fibonacci series upto n numbers
 * @author Devashri
 *
 */
public class FibonacciSeries {
	
	//without recursion
	public void printFibonacciSeries(int n){
		
		int n1=0, n2=1,n3;
		
		System.out.print(n1+" "+n2);
		for(int i=2;i<n;i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
	
	//using recursion
	public void printFibonacciSeriesWithRecursion(int n){
		System.out.print(0+" ");
		for(int i=1;i<n;i++){
			System.out.print(fibonacciRecursive(i)+" ");
		}
	}
	
	public int fibonacciRecursive(int number){
		
		if(number==1 || number ==2){
			return 1;
		}else{
			return fibonacciRecursive(number-1)+fibonacciRecursive(number-2);
		}
		
	}
	
	
}
