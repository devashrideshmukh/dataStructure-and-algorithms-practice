package treesAndGraphs;

public class BinarySearchTree {

	private TreeNode root;

	/**
	 * Time - O(logN)
	 * @param key
	 * @return
	 */
	public TreeNode find(int key) {
		TreeNode current = root;
		if (root == null) {
			return null;
		} else {
			
			while (current.key != key) {
				
				if (key < current.key) {
					current = current.leftChild;
				} else {
					current = current.rightChild;
				}
				if (current == null) {
					return null;
				}

			}

			return current;
		}
	}

	public void insertATreeNode() {
		
	}

	public void delete(int id) {

	}

}
