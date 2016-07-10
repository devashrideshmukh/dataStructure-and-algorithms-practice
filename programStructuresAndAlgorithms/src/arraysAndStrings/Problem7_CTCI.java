package arraysAndStrings;

/**
 * Matrix rotation by 90 degrees
 * 
 * @author Devashri
 *
 */
public class Problem7_CTCI {

	/**
	 * Rotate matrix clockwise by 90 degree
	 * 
	 * @param matrix
	 * @param n
	 */
	public static void rotateClockwise(int[][] matrix,int n){
		for(int layer=0;layer<n/2;++layer){
			int first=layer;
			int last = n-1-layer;
			for(int i=first;i<last;i++){
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i]=matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last]=top;
			}
			
		}
	}

	/**
	 * Rotate matrix anticlockwise by 90 degree
	 * 
	 * @param matrix
	 * @param n
	 */
	public static void rotateAnticlockwise(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[i][last];
				matrix[i][last] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[last - offset][first];
				matrix[last - offset][first] = top;
			}
		}
	}

}
