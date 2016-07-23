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
	
	
	/**
	 * Rotate matrix clockwise by 90 degree
	 * Transpose + reverse rows
	 * ie Transpose + flip vertical 
	 * @param matrix
	 * @param n
	 */
	public static void rotateClockwiseNew(int[][] matrix) {
		
		//taking transpose
		for(int i=0;i<matrix.length;i++){
			for(int j=i+1;j<matrix.length;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i]= temp;
			}
		}
		
		//flip vertical
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length/2;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[0].length-1-j];
				matrix[i][matrix[0].length-1-j] = temp;
			}
		}
	}
	
	/**
	 * Rotate matrix anticlockwise by 90 degree
	 * Transpose + reverse cols
	 * ie Transpose + flip horizontal 
	 * @param matrix
	 * @param n
	 */
	public static void rotateAntiClockwiseNew(int[][] matrix) {
		
		//taking transpose
		for(int i=0;i<matrix.length;i++){
			for(int j=i+1;j<matrix.length;j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i]= temp;
			}
		}
		
		//flip horizontal
		for(int i=0;i<matrix.length/2;i++){
			
				int temp[] = matrix[i];
				matrix[i] = matrix[matrix[0].length-1-i];
				matrix[matrix[0].length-1-i] = temp;
			
		}
	}

}
