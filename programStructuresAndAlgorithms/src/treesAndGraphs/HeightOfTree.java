package treesAndGraphs;

/**
 * Given a binary tree, write a method to find its height recursively. An empty
 * tree has a height of 0.
 * 
 * @author Devashri
 *
 */
public class HeightOfTree {
	public int findHeight(TreeNode root) {

		if (root == null) {
			return 0;
		}
		int left = findHeight(root.leftChild);
		int right = findHeight(root.rightChild);
		return 1 + Math.max(left, right);

	}
}
