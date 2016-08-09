package recursionAndDynamicProgramming.robotInAGrid;

import java.util.ArrayList;
import java.util.HashSet;

public class RobotInGrid {

	public static ArrayList<Point> findPath(boolean[][] maze) {

		// list to store all the points that were traversed
		ArrayList<Point> path = new ArrayList<>();
		/*
		 * hashmap to store visited points along with boolean for Success or
		 * failure to reach destination
		 */
		HashSet<Point> failedPoints = new HashSet<Point>();
		int lastRow = maze.length - 1;
		int lastCol = maze[0].length - 1;

		if (getPath(path, failedPoints, maze, lastRow, lastCol)) {
			return path;
		}
		
		
		return null;
	}

	public static boolean getPath(ArrayList<Point> path,HashSet<Point> failedPoints, boolean[][] maze, int row,
			int col) {
		
		//checking if path can be traversed or no
		if (row < 0 || col < 0 || !maze[row][col]) {
			return false;
		}
		
		Point point = new Point(row, col);
		
		if(failedPoints.contains(point)){
			return false;
		}
		
		boolean isAtOrigin = (row == 0) && (col == 0);
		
		if(isAtOrigin||getPath(path, failedPoints, maze, row, col-1)||getPath(path, failedPoints, maze, row-1, col)){
			path.add(point);
			return true;
		}
		failedPoints.add(point);
		return false;
	}
}
