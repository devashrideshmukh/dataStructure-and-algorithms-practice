package test;

import LinkedList.AddTwoNumbers;
import LinkedList.LinkedList;
import LinkedList.Node;
import LinkedList.ReversingLinkedList;

public class RunnerLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.printAllElements();
		
		System.out.println("\nInserting nodes at first");
		linkedList.insertNodeAtFirst(6);
		linkedList.insertNodeAtFirst(4);
		linkedList.insertNodeAtFirst(2);
		linkedList.insertNodeAtFirst(2);
		linkedList.insertNodeAtFirst(2);
		linkedList.insertNodeAtFirst(6);
		linkedList.insertNodeAtFirst(1);
		linkedList.insertNodeAtFirst(6);
		linkedList.insertNodeAtFirst(18);
		linkedList.printAllElements();
		
		System.out.println("\nInserting nodes at last");
		linkedList.insertANodeAtLast(23);
		linkedList.insertANodeAtLast(15);
		linkedList.printAllElements();
		
		System.out.println("\nInserting node '88' in middle");
		linkedList.insertIntheMiddleOfLinkedList(88);
		linkedList.printAllElements();
		
		System.out.println("\nDeleting node at first");
		linkedList.deleteANodeAFirst();
		linkedList.printAllElements();
		
		System.out.println("\nDeleting node at last");
		linkedList.deleteANodeAtLast();
		linkedList.printAllElements();
		
		
		System.out.println("\nTotal number of Nodes in the list:"+linkedList.numberOfNode());
		
		LinkedList l1 = new LinkedList();
		l1.insertANodeAtLast(2);
		l1.insertANodeAtLast(4);
		l1.insertANodeAtLast(3);
		
		LinkedList l2 = new LinkedList();
		l2.insertANodeAtLast(5);
		l2.insertANodeAtLast(6);
		l2.insertANodeAtLast(4);
		AddTwoNumbers add = new AddTwoNumbers();
		Node sumList = add.addTwoNumbersFromLinkedList(l1.getFirst(), l2.getFirst());
		Node cur = sumList;
		System.out.println("\nSum:"+"\n");
		while(cur!=null){
			System.out.print(cur.getData()+"==>");
			cur=cur.getNext();
		}
		
		
	}
	
}
