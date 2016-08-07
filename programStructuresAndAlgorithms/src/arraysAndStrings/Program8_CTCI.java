package arraysAndStrings;

import utilityPackage.Utility;

/**
 * Zero Matrix Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to 0
 * 
 * @author Devashri
 *
 */
public class Program8_CTCI {

	/**
	 * Method 1
	 * @param matrix
	 */
	public static void setZeros(int[][] matrix) {
		boolean[] rowsOfZeros = new boolean[matrix.length];
		boolean[] columnsOfZeros = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					rowsOfZeros[i] = true;
					columnsOfZeros[j] = true;
				}
			}
		}

		for (int i = 0; i < rowsOfZeros.length; i++) {
			if (rowsOfZeros[i]) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < columnsOfZeros.length; i++) {
			if (columnsOfZeros[i]) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[j][i] = 0;
				}
			}
		}
	}

	/**
	 * Method 2 (Optimized)
	 * @param matrix
	 */
	public static void setZeroesMethod2(int[][] matrix) {

		boolean rowHasZeros = false;
		boolean colHasZeros = false;
		
		//check if first row has zero
		for(int i=0;i<matrix[0].length;i++){
			if(matrix[0][i]==0){
				rowHasZeros=true;
				break;
			}
		}
		
		//check if first col has zeros
		for(int i=0;i<matrix.length;i++){
			if(matrix[i][0]==0){
				colHasZeros=true;
				break;
			}
		}

		//check for zeros in rest of the matrix
		for(int i=1;i<matrix.length;i++){
			for(int j=1;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		
		//nullify rows based on values in first col
		for(int i=1;i<matrix.length;i++){
			if(matrix[i][0]==0){
				nullifyRow(matrix,i);
			}
		}
		
		//nullify cols based on values in first row
		for(int i=1;i<matrix[0].length;i++){
			if(matrix[0][i]==0){
				nullifyCol(matrix,i);
			}
		}
		
		//nullify first column if it contains zero
		if(rowHasZeros){
			nullifyRow(matrix,0);
		}
		
		//nullify first row if it contains zero
		if(colHasZeros){
			nullifyCol(matrix,0);
		}
		
	}

	public static void nullifyCol(int[][] matrix,int col){
		for(int i=0;i<matrix.length;i++){
			matrix[i][col]=0;
		}
	}
	
	public static void nullifyRow(int[][] matrix,int row){
		for(int i=0;i<matrix[0].length;i++){
			matrix[row][i]=0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("==========Zero matrix problem=================================");
		int[][] matrix1 = { { 1, 2, 3, 4, 0, 6 }, { 1, 2, 3, 4, 0, 6 }, { 7, 8, 9, 10, 0, 12 },
				{ 13, 14, 15, 16, 17, 18 }, { 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 },
				{ 31, 32, 33, 34, 35, 36 } };
		Utility.printMatrix(matrix1);
		System.out.println("==================================================");
		Program8_CTCI.setZeroesMethod2(matrix1);
		Utility.printMatrix(matrix1);
		System.out.println("==================================================");
	}

}
