package recursionAndDynamicProgramming.Problem6_CTCI_RD;
import java.util.*;
public class Tower {
	
	private Stack<Integer> disks;
	private int index;
	
	public Tower(int index) {
		this.index=index;
		disks = new Stack<Integer>();
	}
	
	public int getIndex() {
		return index;
	}
	
	public void add(int a){
		if(!disks.isEmpty() && disks.peek()<=a){
			System.out.println("Error placing disk"+a);
		}else{
			disks.push(a);
		}
	}
	
	public void moveTopTo(Tower destination){
		int top = disks.pop();
		destination.add(top);
	}
	
	public void moveDisks(int n,Tower destination,Tower buffer,int numberOfMoves){
		if(n>0){
			moveDisks(n-1, buffer, destination,numberOfMoves);
			moveTopTo(destination);
			buffer.moveDisks(n-1, destination, this,numberOfMoves);
			numberOfMoves++;
		}
		
	}
	
	@Override
	public String toString() {
		return disks.toString();
	}
	
}
