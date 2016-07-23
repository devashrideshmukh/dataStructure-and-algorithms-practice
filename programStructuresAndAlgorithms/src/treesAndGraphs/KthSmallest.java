package treesAndGraphs;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Given a binary search tree and an integer k, implement a method to find and
 * return the kth smallest node.
 * 
 * @author Devashri
 *
 */
public class KthSmallest {
	public TreeNode findKthSmallest(TreeNode root, int k) {

		if (root == null) {
			return null;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();

		while (!stack.isEmpty()) {
			TreeNode node = stack.peek();

			if (node.leftChild != null) {
				stack.push(node.leftChild);
				node.leftChild = null;
			} else {
				nodeList.add(stack.pop());
				if (node.rightChild != null) {
					stack.push(node.rightChild);
				}
			}
		}

		for (TreeNode node : nodeList) {
			System.out.println(node.key);
		}

		if (k <= nodeList.size()) {
			return nodeList.get(k - 1);
		}

		return null;

	}
}
