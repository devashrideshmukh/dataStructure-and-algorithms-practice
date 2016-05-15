package LinkedList;

public class LinkedList {
		
	Node first;
	
	//constructor
	public LinkedList() {
		first=null;
	}
	
	//check if linked list is empty
	public boolean isEmpty(){
		return (first==null);
	}
	
	//insert node at first 
	public void insertNodeAtFirst(int data){
		Node nodeToBeInserted = new Node(data);
		if(isEmpty()){
			this.first=nodeToBeInserted;
			nodeToBeInserted.next=null;
		}else{
			nodeToBeInserted.next=first;
			first = nodeToBeInserted;
		}
	}
	
	//print all linked list elements
	public void printAllElements(){
		
		Node current = first;
		StringBuffer buffer = new StringBuffer();
		if(isEmpty()){
			System.out.println("List is empty");
			return;
		}else{
			System.out.println("\n");
			while (current!=null) {
				buffer.append(current.data);
				buffer.append("==>");
				current=current.next;
			}
		}
		
		int length = buffer.length();
		buffer.deleteCharAt(length-1);
		buffer.deleteCharAt(length-2);
		buffer.deleteCharAt(length-3);
		
		
		System.out.println(buffer.toString());
	}
	
		
}
