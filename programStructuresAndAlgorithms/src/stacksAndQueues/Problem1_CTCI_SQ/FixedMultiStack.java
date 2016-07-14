package stacksAndQueues.Problem1_CTCI_SQ;

/**
 * This class is used to create three stacks 
 * Each stack is of fixed capacity
 * 
 * stackCapacity -> capacity of each stack value -> one array to hold values of
 * all stacks sizes -> array holding sizes of each stack according to
 * stackNumber at index
 * 
 * @author Devashri
 *
 */
public class FixedMultiStack {

	private int numberOfStacks = 3;
	private int stackCapacity;
	private int[] values;
	private int[] sizes;

	public FixedMultiStack(int stackSize) {
		this.stackCapacity = stackSize;
		this.values = new int[stackSize * numberOfStacks];
		this.sizes = new int[stackSize];
	}

	public void push(int stackNumber, int value) throws FullStackException {
		if (isFull(stackNumber)) {
			throw new FullStackException();
		} else {
			sizes[stackNumber]++;
			values[indexOfTop(stackNumber)] = value;
		}
	}

	public int pop(int stackNumber) throws EmptyStackException {
		if (isEmpty(stackNumber)) {
			throw new EmptyStackException();
		} else {

			int valueToBePopped = values[indexOfTop(stackNumber)];
			values[indexOfTop(stackNumber)] = 0;
			sizes[stackNumber]--;
			return valueToBePopped;
		}
	}

	public int peek(int stackNumber) throws EmptyStackException {
		if (isEmpty(stackNumber)) {
			throw new EmptyStackException();
		} else {
			return values[indexOfTop(stackNumber)];
		}
	}

	public boolean isEmpty(int stackNumber) {
		if (sizes[stackNumber] == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull(int stackNumber) {
		if (sizes[stackNumber] == stackCapacity) {
			return true;
		} else {
			return false;
		}
	}

	private int indexOfTop(int stackNumber) {
		int offset = stackCapacity * stackNumber;
		int size = sizes[stackNumber];
		return size + offset - 1;
	}
}
