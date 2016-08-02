package stacksAndQueues;

import java.util.Stack;;

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
