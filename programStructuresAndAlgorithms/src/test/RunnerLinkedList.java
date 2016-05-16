package test;

import LinkedList.LinkedList;
import LinkedList.Node;
import LinkedList.Problem1_CTCI;
import LinkedList.Problem2_CTCI;
import LinkedList.Problem3_CTCI;

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
		
		Problem1_CTCI problem1 = new Problem1_CTCI();
		System.out.println("\nRemoving duplicates (using temporary buffer)");
		problem1.removeDuplicates(linkedList);
		linkedList.printAllElements();
		System.out.println("\nRemoving duplicates (without using temporary buffer)");
		problem1.removeDuplicatesUsingPointers(linkedList);
		linkedList.printAllElements();
		
		
		linkedList.insertNodeAtFirst(3);
		Problem2_CTCI problem2 = new Problem2_CTCI();
		Node kthToLast = problem2.kthToLastElement(3, linkedList);
		linkedList.printAllElements();
		System.out.println("Kth to last element"+kthToLast.getData());
		
		
		Problem3_CTCI problem3 = new Problem3_CTCI();
		System.out.println("Middle node is "+problem3.findMiddleNodeAndDeleteIt(linkedList).getData());
		linkedList.printAllElements();
		
		System.out.println("\nTotal number of Nodes in the list:"+linkedList.numberOfNode());
		
	}
	
}
