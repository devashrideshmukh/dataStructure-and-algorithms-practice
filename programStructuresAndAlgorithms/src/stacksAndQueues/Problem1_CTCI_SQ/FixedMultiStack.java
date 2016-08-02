package stacksAndQueues.Problem1_CTCI_SQ;

import java.util.EmptyStackException;

/**
 * Three In One: Describe how you could use a single array to implement three
 * stacks
 * 
 * @author Devashri
 *
 */
public class FixedMultiStack {
	private int noOfStacks = 3;
	private int[] values;
	private int[] sizes;
	private int capacity;

	public FixedMultiStack(int capacity) {
		this.capacity = capacity;
		values = new int[capacity * noOfStacks];
		sizes = new int[noOfStacks];
	}

	// checks if the stack of given number is empty
	public boolean isStackEmpty(int stackNumber) {
		return sizes[stackNumber] == 0 ? true : false;
	}

	// checks if the stack of given number is full
	public boolean isFull(int stackNumber) {
		return sizes[stackNumber] == capacity ? true : false;
	}

	// returns index of top of the given stack number
	public int indexOfTop(int stackNumber) {
		int offset = stackNumber * capacity;
		int size = sizes[stackNumber];
		return offset + size - 1;
	}

	// push an item into the stack whose number is provided
	public void push(int stackNumber, int item) throws FullStackException {
		if (isFull(stackNumber)) {
			throw new FullStackException();
		}
		sizes[stackNumber]++;
		values[indexOfTop(stackNumber)] = item;

	}

	// pops an item from the stack whose stack number is given
	public int pop(int stackNumber) {
		if (isStackEmpty(stackNumber)) {
			throw new EmptyStackException();
		}

		int topIndex = indexOfTop(stackNumber);
		int valueToBePopped = values[topIndex];
		values[topIndex] = 0;
		sizes[stackNumber]--;
		return valueToBePopped;
	}

	// peek
	public int peek(int stackNumber) {
		if (isStackEmpty(stackNumber)) {
			throw new EmptyStackException();
		}
		int topIndex = indexOfTop(stackNumber);
		return values[topIndex];
	}

}
