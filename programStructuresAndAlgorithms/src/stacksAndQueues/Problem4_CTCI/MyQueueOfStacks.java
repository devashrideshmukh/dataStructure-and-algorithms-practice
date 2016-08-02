package stacksAndQueues.Problem4_CTCI;

import stacksAndQueues.MyStack;

public class MyQueueOfStacks<T>{
	MyStack<T> stackNewest;
	MyStack<T> stackOldest;
	
	public MyQueueOfStacks() {
		stackNewest = new MyStack<T>();
		stackOldest = new MyStack<T>();
	}
	
	public int size(){
		return stackOldest.size()+stackNewest.size();
	}
	
	public void add(T value){
		//push to stack newest, which has newest items on top
		stackNewest.push(value);
	}
	
	private void shiftStacks(){
		if(stackOldest.isEmpty()){
			while(!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public T peek(){
		shiftStacks();
		return stackOldest.peek();
	}
	
	public T pop(){
		shiftStacks();
		return stackOldest.pop();
	}
	
}
