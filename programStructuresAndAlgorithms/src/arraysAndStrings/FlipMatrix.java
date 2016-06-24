package arraysAndStrings;

/**
 * You are given an m x n 2D image matrix where each integer represents a pixel.
 * Flip it in-place along its horizontal axis.
 * 
 * @author Devashri
 *
 */
public class FlipMatrix {

	public static void flipHorizontalAxis(int[][] matrix) {
		for (int i = 0; i < (matrix.length / 2); i++) {
			int[] temp = matrix[i];
			matrix[i] = matrix[matrix.length-i-1];
			matrix[matrix.length-i-1] = temp;
		}
	}
	
	public static void flipItVerticalAxis(int[][] matrix) {
		for (int i = 0; i < (matrix[0].length / 2); i++) {
			for(int j=0;j<matrix.length;j++){
				int temp = matrix[j][i];
				matrix[j][i] =matrix[j][matrix[0].length-i-1];
				matrix[j][matrix[0].length-i-1] = temp;
			}
			
		}
	}

}
