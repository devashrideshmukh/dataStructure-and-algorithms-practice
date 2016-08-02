package stacksAndQueues.Problem3_CTCI;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Stack Of Plates: Imagine a (literal) stack of plates. If the stack gets too
 * high, it might topple. Therefore, in real life, we would likely start a new
 * stack when the previous stack exceeds some threshold. Implement a Data
 * Structure SetOfStacks that mimics this. SetOfStacks should be composed of
 * several stacks and should create a new stack once the previous one exceeds
 * its capacity. Implement popAt(int index) which performs a pop operation on a
 * specific sub-stack
 * 
 * @author Devashri
 *
 */
public class SetOfStacks {

	ArrayList<SetStack> listOfStacks = new ArrayList<SetStack>();
	public int capacity;

	public SetOfStacks(int capacity) {
		this.capacity = capacity;
	}

	public SetStack getLastStack() {
		if (listOfStacks.size() == 0) {
			return null;
		} else {
			return listOfStacks.get(listOfStacks.size() - 1);
		}
	}

	// this method checks if the entire stack is empty
	public boolean isEmpty() {
		SetStack lastStack = getLastStack();
		return (lastStack == null || lastStack.isEmpty());
	}

	/**
	 * Get last stack and add elements to it if last stack is full, create a new
	 * stack add it to list and push elements to that stack
	 * 
	 * @param value
	 */
	public void push(int value) {
		SetStack last = getLastStack();
		if (last != null && !last.isFull()) {
			last.push(value);
		} else {
			SetStack newStack = new SetStack(capacity);
			newStack.push(value);
			listOfStacks.add(newStack);
		}
	}

	/**
	 * Get last, if last is empty throw exception If not, pop element from last
	 * stack If Last stack is empty, remove the stack from listofstacks
	 * 
	 * @return
	 */
	public int pop() {
		SetStack last = getLastStack();
		if (last == null) {
			throw new EmptyStackException();
		}

		int nodeToBePopped = last.pop();
		if (last.size == 0) {
			listOfStacks.remove(listOfStacks.size() - 1);
		}
		return nodeToBePopped;
	}

	/**
	 * Pop element at a certain stack
	 * 
	 * @param index
	 * @return
	 */
	public int popAt(int index) {
		return leftShift(index, true);
	}

	public ArrayList<SetStack> getListOfStacks() {
		return listOfStacks;
	}

	public int leftShift(int index, boolean removeTop) {

		SetStack stack = listOfStacks.get(index);
		int itemToBeRemoved;

		if (removeTop) {
			itemToBeRemoved = stack.pop();
		} else {
			itemToBeRemoved = stack.removeBottom();
		}

		if (stack.isEmpty()) {
			listOfStacks.remove(index);
		} else if (listOfStacks.size() > index + 1) {
			int val = leftShift(index + 1, false);
			stack.push(val);
		}
		return itemToBeRemoved;
	}

}
