package stacksAndQueues;

import java.util.Stack;;

/**
 * Sort Stack: Write a program to sort a stack such that the smallest items are
 * on the top. You can use an additional temporary stack, but you may not copy
 * the elements into any other data structure (such as an array). The stack
 * supports the following operations: push, pop, peek, and isEmpty.
 * 
 * @author Devashri
 *
 */
public class Problem5_CTCI {

	public static Stack<Integer> sort(Stack<Integer> stackToBeSorted) {

		Stack<Integer> temp = new Stack<>();

		while (!stackToBeSorted.isEmpty()) {
			Integer tempNode = stackToBeSorted.pop();
			while (!temp.isEmpty() && tempNode > temp.peek()) {
				stackToBeSorted.push(temp.pop());
			}
			temp.push(tempNode);
		}

		return temp;
	}

}
