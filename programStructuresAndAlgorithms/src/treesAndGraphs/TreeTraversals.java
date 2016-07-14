package treesAndGraphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversals {

	/**
	 * Pre-order traversal using recursion
	 * 
	 * @param root
	 */
	public void preOrderTraversal(TreeNode root) {
		if (root != null) {
			System.out.println(root.key + " ");
			preOrderTraversal(root.leftChild);
			preOrderTraversal(root.rightChild);
		}
	}

	/**
	 * Pre-order traversal using iteration
	 * 
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();

		if (root == null) {
			return list;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.empty()) {

			TreeNode temp = stack.pop();
			list.add(temp.key);

			if (temp.rightChild != null) {
				stack.push(temp.rightChild);
			}

			if (temp.leftChild != null) {
				stack.push(temp.leftChild);
			}

		}

		return list;
	}

	/**
	 * Pre-order traversal Returning list using recursion
	 * 
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversalRecursion(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		recPre(root, list);
		return list;
	}

	public void recPre(TreeNode node, List<Integer> list) {
		if (node != null) {
			list.add(node.key);
			recPre(node.leftChild, list);
			recPre(node.rightChild, list);
		}
	}

	/**
	 * In-order traversal using recursion
	 * 
	 * @param root
	 */
	public void inOrderTraversal(TreeNode root) {
		if (root != null) {
			inOrderTraversal(root.leftChild);
			System.out.println(root);
			inOrderTraversal(root.rightChild);
		}
	}

	/**
	 * In-order traversal using recursion returning list
	 * 
	 * @param root
	 */
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		recInorder(root, list);
		return list;
	}

	public void recInorder(TreeNode node, List<Integer> list) {
		if (node != null) {
			recInorder(node.leftChild, list);
			list.add(node.key);
			recInorder(node.rightChild, list);
		}

	}

	public List<Integer> inorderTraversalIteration(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();

		if (root == null) {
			return list;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);

		while (!stack.empty()) {
			TreeNode node = stack.peek();

			if (node.leftChild != null) {
				stack.push(node.leftChild);
				node.leftChild = null;
			} else {
				list.add(node.key);
				stack.pop();
				if (node.rightChild != null) {
					stack.push(node.rightChild);
				}
			}

		}

		return list;
	}

	/**
	 * Post-order traversal using recursion
	 * 
	 * @param root
	 */
	public void preOrderTraversalRecursion(TreeNode root) {
		if (root != null) {

			preOrderTraversal(root.leftChild);
			preOrderTraversal(root.rightChild);
			System.out.println(root.key + " ");
		}
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		recPost(root, list);
		return list;
	}

	public void recPost(TreeNode node, List<Integer> list) {
		if (node != null) {
			recPost(node.leftChild, list);
			recPost(node.rightChild, list);
			list.add(node.key);

		}
	}

	public List<Integer> postorderTraversalIterative(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();

		if (root == null) {
			return list;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);

		while (!stack.empty()) {
			TreeNode node = stack.peek();
			if (node.leftChild == null && node.rightChild == null) {
				TreeNode temp = stack.pop();
				list.add(temp.key);
			} else {

				if (node.rightChild != null) {
					stack.push(node.rightChild);
					node.rightChild = null;
				}

				if (node.leftChild != null) {
					stack.push(node.leftChild);
					node.leftChild = null;
				}

			}
		}

		return list;

	}

}
