package arraysAndStrings;

public class ProblemsOnArrays {

	/**
	 * You are given a square 2D image matrix where each integer represents a
	 * pixel. Write a method transposeMatrix to transform the matrix into its
	 * Transpose - in-place.
	 * 
	 * @param matrix
	 */
	public static void transposeMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

}
