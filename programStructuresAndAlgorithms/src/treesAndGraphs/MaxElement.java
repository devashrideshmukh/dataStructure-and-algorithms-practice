package treesAndGraphs;

/**
 * Given a binary tree, write a recursive method to return the maximum element.
 * @author Devashri
 *
 */
public class MaxElement {
	public int findMax(TreeNode root) {

		if (root == null) {
			return Integer.MIN_VALUE;
		}

		int result = root.key;

		int leftRes = findMax(root.leftChild);
		int rightRes = findMax(root.rightChild);
		if (leftRes > result) {
			result = leftRes;
		}

		if (rightRes > result) {
			result = rightRes;
		}

		return result;

	}
}
