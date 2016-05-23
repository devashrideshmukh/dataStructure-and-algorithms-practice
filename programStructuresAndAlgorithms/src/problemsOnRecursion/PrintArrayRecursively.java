package problemsOnRecursion;

public class PrintArrayRecursively {

	
	public void printArrayRecursively(int[] array,int N){
		
		if(N==0){
			return;
		}else{
			System.out.print(array[array.length-N]+"\t");
			printArrayRecursively(array, N-1);
		}
		
	}
	
	public void printArrayRecursivelyInReverseOrder(int[] array,int N){
		
		if(N==0){
			return;
		}else{
			printArrayRecursivelyInReverseOrder(array, N-1);
			System.out.print(array[array.length-N]+"\t");
			
		}
		//pA(a,8)pA(a,7)pA(a,6)pA(a,5)pA(a,4)pA(a,3)pA(a,2)pA(a,1)pA(a,0)
		//2 4 
	}
	
	
}
