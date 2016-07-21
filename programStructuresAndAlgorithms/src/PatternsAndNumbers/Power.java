package PatternsAndNumbers;

/**
 * Write a method - pow(x,n) that returns the value of x raised to the power of
 * n (xn). n can be negative!
 * 
 * @author Devashri
 *
 */
public class Power {

	public static double pow(double x, int n) {

		if(n<0){
			return 1/power(x,-n);
		}else{
			return power(x,n);
		}

	}
	
	public static double power(double x,int n){
		
		if(n==0){
			return 1;
		}
		
		double v = power(x, n/2);
		
		if(n%2==0){
			return v*v;
		}else{
			return v*v*x;
		}
		
		
	}
}
