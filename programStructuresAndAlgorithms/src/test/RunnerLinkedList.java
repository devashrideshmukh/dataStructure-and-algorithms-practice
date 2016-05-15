package test;

import LinkedList.LinkedList;
import LinkedList.Problem1_CTCI;

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
		
		System.out.println("\nDeleting node at middle");
		linkedList.deleteIntheMiddle();
		linkedList.printAllElements();
		
		System.out.println("\nDeleting node at last");
		linkedList.deleteANodeAtLast();
		linkedList.printAllElements();
		
		Problem1_CTCI problem1 = new Problem1_CTCI();
		System.out.println("\nRemoving duplicates (using temporary buffer)");
		problem1.removeDuplicates(linkedList);
		linkedList.printAllElements();
		System.out.println("\nRemoving duplicates (without using temporary buffer)");
		problem1.removeDuplicatesUsingPointers(linkedList);
		linkedList.printAllElements();
		
		System.out.println("\nTotal number of Nodes:"+linkedList.numberOfNode());
		
	}
	
}
