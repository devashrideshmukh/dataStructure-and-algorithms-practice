package treesAndGraphs;

public class ValidateBST {

	public static boolean validateBST(TreeNode root) {
		return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	public static boolean isValid(TreeNode n, double min, double max) {
		if (n == null) {
			return true;
		}

		if (n.key <= min || n.key >= max) {
			return false;
		}

		return (isValid(n.leftChild, min, n.key) && isValid(n.rightChild, n.key, max));
	}

}
