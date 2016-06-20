package arraysAndStrings;

/**
 * Zero Matrix
 * Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to 0
 * @author Devashri
 *
 */
public class Program8_CTCI {

	public static void setZeros(int[][] matrix){
		boolean[] rowsOfZeros = new boolean[matrix.length];
		boolean[] columnsOfZeros = new boolean[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					rowsOfZeros[i]=true;
					columnsOfZeros[j]=true;
				}
			}
		}
		
		for(int i=0;i<rowsOfZeros.length;i++){
			if(rowsOfZeros[i]){
				for(int j=0;j<matrix[0].length;j++){
					matrix[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<columnsOfZeros.length;i++){
			if(columnsOfZeros[i]){
				for(int j=0;j<matrix[0].length;j++){
					matrix[j][i]=0;
				}
			}
		}
	}	
	
}
