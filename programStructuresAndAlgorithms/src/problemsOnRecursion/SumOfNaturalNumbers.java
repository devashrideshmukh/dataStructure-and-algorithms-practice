package problemsOnRecursion;

public class SumOfNaturalNumbers {

	public int getSumOfnNaturalNumbers(int n){
		
		if(n==1){
			return 1;
		}else{
			
			return (getSumOfnNaturalNumbers(n-1)+n);
		}
	}
	
	
}
