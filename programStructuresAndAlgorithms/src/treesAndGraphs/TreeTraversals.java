package treesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversals {

	/**
	 * Pre-order traversal using recursion
	 * 
	 * @param root
	 */
	public static void preOrderTraversal(TreeNode root) {
		if (root != null) {
			System.out.print(root.key + " ");
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
	public static List<Integer> preorderTraversal(TreeNode root) {
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
	public static List<Integer> preorderTraversalRecursion(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		recPre(root, list);
		return list;
	}

	public static void recPre(TreeNode node, List<Integer> list) {
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
	public static void inOrderTraversal(TreeNode root) {
		if (root != null) {
			inOrderTraversal(root.leftChild);
			System.out.print(root.key + " ");
			inOrderTraversal(root.rightChild);
		}
	}

	/**
	 * In-order traversal using recursion returning list
	 * 
	 * @param root
	 */
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		recInorder(root, list);
		return list;
	}

	public static void recInorder(TreeNode node, List<Integer> list) {
		if (node != null) {
			recInorder(node.leftChild, list);
			list.add(node.key);
			recInorder(node.rightChild, list);
		}

	}

	public static List<Integer> inorderTraversalIteration(TreeNode root) {

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
	public static void postOrderTraversalRecursion(TreeNode root) {
		if (root != null) {

			postOrderTraversalRecursion(root.leftChild);
			postOrderTraversalRecursion(root.rightChild);
			System.out.print(root.key + " ");
		}
	}

	public static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		recPost(root, list);
		return list;
	}

	public static void recPost(TreeNode node, List<Integer> list) {
		if (node != null) {
			recPost(node.leftChild, list);
			recPost(node.rightChild, list);
			list.add(node.key);

		}
	}

	public static List<Integer> postorderTraversalIterative(TreeNode root) {
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

	public static void levelOrderTraversal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root == null) {
			return;
		}

		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.remove();
			System.out.print(node.key + " ");

			if (node.leftChild != null) {
				queue.add(node.leftChild);
			}

			if (node.rightChild != null) {
				queue.add(node.rightChild);
			}
		}

	}

	

}
