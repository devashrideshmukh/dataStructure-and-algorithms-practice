package treesAndGraphs;

/**
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
 * 
 * @author Devashri
 *
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {

		if (root == null) {
			return true;
		}

		if (getHeight(root) == -1) {
			return false;
		}

		return true;
	}

	public int getHeight(TreeNode node) {

		if (node == null) {
			return 0;
		}

		int left = getHeight(node.leftChild);
		int right = getHeight(node.rightChild);

		if (left == -1 || right == -1) {
			return -1;
		}

		if (Math.abs(left - right) > 1) {
			return -1;
		}

		return 1 + Math.max(left, right);

	}
}
