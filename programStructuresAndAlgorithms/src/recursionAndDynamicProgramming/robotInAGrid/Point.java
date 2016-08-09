package recursionAndDynamicProgramming.robotInAGrid;

public class Point {

	private int row;
	private int col;
	
	public Point(int row,int col) {
		this.row=row;
		this.col=col;
	}
	
	public int getCol() {
		return col;
	}
	
	public int getRow() {
		return row;
	}
	
	@Override
	public String toString() {
		return "("+row+","+col+")";
	}
	
	@Override
	public boolean equals(Object o) {
		if ((o instanceof Point) && (((Point) o).row == this.row) && (((Point) o).col == this.col)) {
            return true;
        } else {
            return false;
        }
	}
}
