package arraysAndStrings;

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
	public void setZeroes(int[][] matrix) {

		boolean rowHasZero = false;
		boolean colHasZero = false;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				colHasZero = true;
				break;
			}
		}

		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				rowHasZero = true;
				break;
			}
		}

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		for (int i = 1; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				nullifyColumn(matrix, i);
			}
		}

		for (int j = 0; j < matrix.length; j++) {
			if (matrix[j][0] == 0) {
				nullifyRow(matrix, j);
			}
		}

		if (rowHasZero) {
			nullifyRow(matrix, 0);
		}

		if (colHasZero) {
			nullifyColumn(matrix, 0);
		}

	}

	public void nullifyRow(int[][] matrix, int row) {
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[row][i] = 0;
		}
	}

	public void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}

}
