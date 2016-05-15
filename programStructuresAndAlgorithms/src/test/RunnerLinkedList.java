package test;

import LinkedList.LinkedList;

public class RunnerLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.printAllElements();
		
		linkedList.insertNodeAtFirst(6);
		linkedList.insertNodeAtFirst(4);
		linkedList.insertNodeAtFirst(2);
		linkedList.insertNodeAtFirst(1);
		linkedList.insertNodeAtFirst(18);
		linkedList.insertANodeAtLast(23);
		linkedList.insertANodeAtLast(15);
		linkedList.printAllElements();
		
		
		linkedList.insertIntheMiddleOfLinkedList(88);
		linkedList.printAllElements();
		System.out.println("Total number of Node:"+linkedList.numberOfNode());
		
	}
	
}
