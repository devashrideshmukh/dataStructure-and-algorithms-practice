package test;

import stacksAndQueues.Stack;

public class RunnerStacksAndQueues {

	public static void main(String[] args) {
		
		Stack stack = new Stack(4);
		stack.push(2);
		stack.push(4);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.push(2);
		stack.push(4);
		
		System.out.println("printing stack");
		stack.printStack();
	}
	
}
