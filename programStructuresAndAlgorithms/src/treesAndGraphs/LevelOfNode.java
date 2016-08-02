package treesAndGraphs;

import java.util.LinkedList;

/**
 * Find the level of a given node in Binary tree
 * 
 * @author Devashri
 *
 */
public class LevelOfNode {

	public static int findLevelRecursive(TreeNode root, int value, int level) {
		if (root == null) {
			return 0;
		} else if (root.key == value) {
			return level;
		} else {
			return findLevelRecursive(root.leftChild, value, level + 1)
					| findLevelRecursive(root.rightChild, value, level + 1);
		}
	}

	public static int findLevelIterative(TreeNode root, int value) {

		if (root == null) {
			return Integer.MIN_VALUE;
		}

		LinkedList<TreeNode> current = new LinkedList<>();
		LinkedList<TreeNode> next = new LinkedList<>();
		current.add(root);
		int levelNumber = 0;
		while (!current.isEmpty()) {

			TreeNode cuNode = current.removeFirst();
			if (cuNode.key == value) {
				return levelNumber;
			}

			if (cuNode.leftChild != null) {
				next.add(cuNode.leftChild);
			}

			if (cuNode.rightChild != null) {
				next.add(cuNode.rightChild);
			}

			if (current.isEmpty()) {
				levelNumber++;
				current = next;
				next = new LinkedList<>();
			}

		}

		return levelNumber;

	}

}
