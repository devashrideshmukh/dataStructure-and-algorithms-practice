package utilityPackage;

public class Utility {

	public static void printSquareMatrix(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
		
	public static void printMatrix(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}

