package recursionAndDynamicProgramming.robotInAGrid;

import java.util.ArrayList;

public class UtilRobot {

	public static boolean[][] createMaze(int numOfRows,int numOfCols){
		boolean[][] maze = randomBooleanMatrix(numOfRows, numOfCols,90);
		return maze;
	}
	
	public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}
	
	public static boolean randomBoolean(int percentTrue) {
		return randomIntInRange(1, 100) <= percentTrue;
	}
	
	public static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}
	
	public static boolean[][] randomBooleanMatrix(int M, int N, int percentTrue) {
		boolean[][] matrix = new boolean[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = randomBoolean(percentTrue);
			}
		}
		matrix[0][0]=true;
		matrix[M-1][N-1]=true;
		return matrix;
	}
	
	public static void printMaze(boolean[][] maze){
		for(int i=0;i<maze.length;i++){
			for(int j=0;j<maze[0].length;j++){
				System.out.print(maze[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		boolean[][] maze = createMaze(7, 5);
		printMaze(maze);
		ArrayList<Point> path = RobotInGrid.findPath(maze);
		
		if(path!=null){
		for(Point p:path){
			System.out.print(p+" ");
		}
		}else{
			System.err.println("No path found!");
		}
	}
}
