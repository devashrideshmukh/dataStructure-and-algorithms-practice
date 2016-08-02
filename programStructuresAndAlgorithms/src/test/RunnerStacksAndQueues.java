package test;

import stacksAndQueues.MyQueue;
import stacksAndQueues.MyStack;
import stacksAndQueues.Problem5_CTCI;
import stacksAndQueues.Stack;
import stacksAndQueues.Problem1_CTCI_SQ.FixedMultiStack;
import stacksAndQueues.Problem1_CTCI_SQ.FullStackException;
import stacksAndQueues.Problem2_CTCI.StackMin;
import stacksAndQueues.Problem2_CTCI.StackMinWithStack;
import stacksAndQueues.Problem3_CTCI.SetOfStacks;
import stacksAndQueues.Problem4_CTCI.MyQueueOfStacks;

public class RunnerStacksAndQueues {

	public static void main(String[] args) throws FullStackException{
		
		System.out.println("======================Custom Stack using array========================");
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
		
		//======================Custom Stack using linked list========================//
		System.out.println("======================Custom Stack using linked list========================");
		MyStack<String> stk = new MyStack<>();
		stk.push("Devashri");
		stk.push("Deshmukh");
		stk.printStack();
		System.out.println(stk.pop());
		System.out.println(stk.peek());
		stk.printStack();
		

		//======================Custom Queue using linked list========================//
		System.out.println("======================Custom Queue using linked list========================");
		MyQueue<Integer> q = new MyQueue<>();
		q.add(5);
		q.add(6);
		q.add(9);
		q.printQueue();
		q.remove();
		q.printQueue();
		System.out.println(q.peek());
		
		//======================PROBLEM 1: CTCI - Fixed Stack========================//
		System.out.println("======================Fixed Stack========================");
		FixedMultiStack stacks = new FixedMultiStack(2);
		stacks.push(0,5);
		stacks.push(1, 2);
		stacks.push(1, 3);
		System.out.println(stacks.peek(0));
		System.out.println(stacks.pop(1));
		System.out.println(stacks.peek(1));
		stacks.push(1, 2);
		System.out.println(stacks.peek(1));		
		stacks.pop(0);
		//System.out.println(stacks.peek(0));
		
		//======================PROBLEM 2: CTCI - Stack Min========================//
		System.out.println("======================Stack Min========================");
		System.out.println("====Method 1=====");
		StackMin sm = new StackMin();
		sm.push(4);
		sm.push(3);
		sm.push(5);
		System.out.println("Min : " +sm.min());
		System.out.println("Peeking : " +sm.peek().value);
		System.out.println("Popping : "+sm.pop().value);
		System.out.println("Min :" + sm.min());
		System.out.println("Popping : "+ sm.pop().value);
		System.out.println("Min :" + sm.min());
		System.out.println("====Method 2=====");
		StackMinWithStack sms = new StackMinWithStack();
		sms.push(4);
		sms.push(3);
		sms.push(5);
		System.out.println("Min : " +sms.min());
		System.out.println("Peeking : " +sms.peek());
		System.out.println("Popping : "+sms.pop());
		System.out.println("Min :" + sms.min());
		System.out.println("Popping : "+ sms.pop());
		System.out.println("Min :" + sms.min());
		//======================PROBLEM 3: CTCI - Stack of Plates========================//
		System.out.println("======================Stack of Plates========================");
		SetOfStacks s = new SetOfStacks(3);
		s.push(4);
		s.push(4);
		s.push(4);
		s.push(5);
		s.push(5);
		s.push(5);
		s.push(6);
		s.push(6);
		s.push(6);
		s.popAt(1);
		System.out.println(s.getListOfStacks().get(1).peek());
		//======================PROBLEM 4: CTCI - Queue Via Stacks========================//
		System.out.println("======================Queue Via Stacks========================");		
		MyQueueOfStacks<String> qs= new MyQueueOfStacks<>();
		qs.add("D");
		qs.add("E");
		qs.add("V");
		qs.add("A");
		System.out.println(qs.size());
		System.out.println(qs.pop());
		System.out.println(qs.peek());
		System.out.println(qs.size());
		
		//======================PROBLEM 5: CTCI - Sort Stack========================//
		System.out.println("======================Sort Stack========================");	
		java.util.Stack<Integer> stk1 = new java.util.Stack<>();
		stk1.push(5);
		stk1.push(4);
		stk1.push(2);
		stk1.push(8);
		stk1.push(7);
		java.util.Stack<Integer> stk2=Problem5_CTCI.sort(stk1);
		while(!stk2.isEmpty()){
			System.out.println(stk2.pop());
		}
				
	}
	
}
