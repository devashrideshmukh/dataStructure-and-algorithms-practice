package LinkedList;

public class DLLNode {

	public int data;
	public DLLNode next;
	public DLLNode previous;
	
	public DLLNode(int data,DLLNode next,DLLNode previous) {
		this.data=data;
		this.next=next;
		this.previous=previous;
	}
	
	public DLLNode(int data) {
		this.data=data;
	}
	
	public void displayDLLNode(){
		System.out.print(this.data);
	}
}
